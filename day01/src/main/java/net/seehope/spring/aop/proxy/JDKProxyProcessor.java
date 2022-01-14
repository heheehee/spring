package net.seehope.spring.aop.proxy;


import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;


public class JDKProxyProcessor implements InvocationHandler {
    private Object target;
    private String interceptorName;


    public JDKProxyProcessor(Object target) {
        this.target=target;
    }
    public JDKProxyProcessor(){

    }
    public JDKProxyProcessor(Object target,String interceptorName){
        this.target=target;
        this.interceptorName=interceptorName;
    }

    /**
     * @param proxy  代理对象
     * @param method 原始对象中的每一个方法
     * @param args   原始对象被调用的时候的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (StringUtils.hasText(interceptorName)) {
            Interceptor interceptor = (Interceptor) Class.forName(interceptorName).newInstance();
            try {
                if (interceptor.before(target, proxy, method, args)) {
                    result = interceptor.around(target, proxy, method, args);
                    interceptor.afterReturning(target, proxy, method, args, result);

                } else {
                    throw new RuntimeException("前置拦截返回为false ，方法终止");
                }
            } catch (Exception e) {
                interceptor.afterThrowing(target, proxy, method, args, e);
            } finally {
                interceptor.after(target, proxy, method, args);
            }
        } else {
            result = method.invoke(target, args);//在框架中经常会会用到method.invoke()方法，用来执行某个的对象的目标方法。以前写代码用到反射时，总是获取先获取Method，然后传入对应的Class实例对象执行方法。

            System.out.println(new Date() + "use args" +
                    Arrays.toString(args) + "use " + method.getName() + " get " + result + " as result");
        }
        return result;
    }
}
