package net.seehope.spring.ioc.mocktomcat;

import net.seehope.spring.ioc.service.AccountService;
import net.seehope.spring.ioc.web.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MockTomcat {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       /* MockHttpServlet httpServlet1 = (MockHttpServlet) applicationContext.getBean("mockServlet1");
        MockHttpServlet httpServlet2 = (MockHttpServlet) applicationContext.getBean("mockServlet2");

        MockHttpServlet httpServlet11 = (MockHttpServlet) applicationContext.getBean("mockServlet1");
        MockHttpServlet httpServlet22 = (MockHttpServlet) applicationContext.getBean("mockServlet2");

        System.out.println(httpServlet1);
        System.out.println(httpServlet11);

        System.out.println(httpServlet2);
        System.out.println(httpServlet22);

        applicationContext.getBeansOfType(MockHttpServlet.class).keySet().forEach(key -> {
            System.out.println(key);
        });*/

      /*  MockServlet3 mockServlet3 = (MockServlet3) applicationContext.getBean("mockServlet3");
        System.out.println(mockServlet3.getUsername());
        System.out.println(mockServlet3.getAge());
        mockServlet3.getIds().forEach(key->{
            System.out.println(key);
        });
        mockServlet3.getMockHttpServlet().doService();
        mockServlet3.getMap().keySet().forEach(key->{
            System.out.println("key:"+ key+" value: "+mockServlet3.getMap().get());
        });*/

        UserController userController = (UserController) applicationContext.getBean("1");//ApplicationContext的getBean方法来获取Spring容器中已初始化的bean
        userController.handleRequest();
        AccountService accountService=(AccountService) applicationContext.getBean("accountServiceImpl");
        accountService.transfer(1,2,10d);

    }
}
