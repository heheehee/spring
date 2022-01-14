package net.seehope.spring.ioc.service.impl;

import net.seehope.spring.ioc.mapper.UserMapper;
import net.seehope.spring.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void doService() {
        userMapper.sayHello();
    }


}
