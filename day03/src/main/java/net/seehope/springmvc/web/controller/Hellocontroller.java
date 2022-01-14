package net.seehope.springmvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
//在Spring MVC 中使用 @RequestMapping 来映射请求，也就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
@RequestMapping("/hello")
public class Hellocontroller {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;


    @RequestMapping("/1")
    public void sayHello(String username, String password, int age, User user){
        request.getParameterMap().keySet().forEach(key->{
            System.out.println("key:"+key);
        });
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        System.out.println(user);
        System.out.println("hello");
    }
//    @RequestMapping("/2")
//    public void sayHello2(){
//        System.out.println("hello2");
//    }
    @RequestMapping("/2")
    //ModelAndView构造方法可以指定返回的页面名称，
    //也可以通过setViewName()方法跳转到指定的页面 ,
    public ModelAndView sayHello2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","12234343");
        modelAndView.setViewName("user");
        return modelAndView;
    }
    @RequestMapping("/4")
    //ModelAndView构造方法可以指定返回的页面名称，
    //也可以通过setViewName()方法跳转到指定的页面 ,
    public ModelAndView sayHello4(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","12234343");
        modelAndView.setViewName("forword:user");
        return modelAndView;
    }
    @RequestMapping("/3")
    public ModelAndView sayHello3(String keyword){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","12234343");
        modelAndView.setViewName("redirect:http://www.baidu.com/s?wd="+keyword);
        return modelAndView;
    }
}
