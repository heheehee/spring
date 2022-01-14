package net.seehope.spring.ioc.mapper;


import org.springframework.stereotype.Repository;

@Repository

public class UserMapper implements UserMapperInterface{
    @Override
    public void sayHello(){
        System.out.println("hello");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
