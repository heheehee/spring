package net.seehope.spring.aop.proxy;

import net.seehope.spring.ioc.mapper.UserMapper;
import net.seehope.spring.ioc.mapper.UserMapperInterface;


public class ProxyMain {
    public static void main(String[] args) {
        UserMapper userMapper=new UserMapper();
        userMapper.sayHello();


        UserMapperInterface proxyUserMapper = (UserMapperInterface) JDKProxyFactory.bind(userMapper, "net.seehope.spring.aop.proxy.InterceptorImpl");
        UserMapperInterface proxyUserMapper2 = (UserMapperInterface) JDKProxyFactory.bind(proxyUserMapper, "net.seehope.spring.aop.proxy.InterceptorImpl");

        proxyUserMapper2.sayHello();
        System.out.println(proxyUserMapper2.add(1, 2));
    }
}
