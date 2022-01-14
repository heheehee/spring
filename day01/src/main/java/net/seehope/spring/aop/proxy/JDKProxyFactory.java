package net.seehope.spring.aop.proxy;

import java.lang.reflect.Proxy;

//@param target目标对象
//@return 代理对象
public class JDKProxyFactory {
    public static Object bind(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new JDKProxyProcessor(target));
    }
    public static Object bind(Object target,String interceptorName){
        return Proxy.newProxyInstance((target.getClass().getClassLoader()),
                target.getClass().getInterfaces(),new JDKProxyProcessor(target,interceptorName));
    }
}
