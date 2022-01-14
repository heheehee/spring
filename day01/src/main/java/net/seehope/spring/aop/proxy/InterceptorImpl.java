package net.seehope.spring.aop.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class InterceptorImpl implements Interceptor{
    @Override
    public Boolean before(Object target, Object proxy, Method method, Object[] args) {
        return true;
    }

    @Override
    public Object around(Object target, Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        Object result=method.invoke(target, args);
        return result;
    }

    @Override
    public void afterReturning(Object target, Object proxy, Method method, Object[] args, Object result) {
        System.out.println(new Date() + "use args" +
                Arrays.toString(args) + "use " + method.getName() + " get " + result + " as result");
    }

    @Override
    public void afterThrowing(Object target, Object proxy, Method method, Object[] args, Exception e) {
        e.printStackTrace();//通常e.getMessage()并不能获取全部的错误信息,需要用到e.printStackTrace()查看完整错误信息，但是这个方法是void 只能在控制台输出。
    }

    @Override
    public void after(Object target, Object proxy, Method method, Object[] args) {

    }
}
