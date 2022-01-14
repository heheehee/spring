package net.seehope.spring.ioc.web.controller;

import net.seehope.spring.ioc.service.UserService;
import net.seehope.spring.ioc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @controller
 * @service
 * @repository
 * @configuration
 * @Component
 *
 * 功能都是一样的，将被标注的类（配合注解扫描）注册到容器中
 * @Autowired 首先通过类型匹配，如果有且只有一个那就直接注入，如果找到了多个匹配
 * 的bean，那么判断bean的id和成员变量的名字是否一致，如果一致注入，如果找不到报Bug
 * @Qualifier 如果同类型有多个匹配，指定具体bean的id
 *
 *
 *
 **/
@Controller("1")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    public void handleRequest() {
        userService.doService();
    }


}
