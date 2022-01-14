package net.seehope.spring.aop.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface Interceptor {
    /**
     * 方法执行之前，如果返回为false 那么方法终止
     *
     * @param target
     * @param proxy
     * @param method
     * @param args
     * @return
     */
    Boolean before(Object target, Object proxy, Method method, Object[] args);
    Object around(Object target, Object proxy, Method method, Object[] args)throws InvocationTargetException, IllegalAccessException;
    /**
     * 方法执行之后，需要将方法执行之后的结果传入
     *
     * @param target
     * @param proxy
     * @param method
     * @param args
     * @param result
     */
    void afterReturning(Object target, Object proxy, Method method, Object[] args, Object result);

    /**
     * 方法发生异常之后，需要将异常的对象传进来
     *
     * @param target
     * @param proxy
     * @param method
     * @param args
     * @param e
     */
    void afterThrowing(Object target, Object proxy, Method method, Object[] args, Exception e);
    void after(Object target, Object proxy, Method method, Object[] args);
}
