package net.seehope.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.User;

import java.util.ArrayList;
import java.util.List;
//1.请求分发
//Restful 风格的API
// /user 表示对获取User表中的资源进行访问
// /user get 表示获取User表中的所有记录
// /user/1 get 表示获取User表中的id为1的记录
// /user post 添加User表中的记录
// /user/{id} put 修改user表中的第id条记录
// /user/{id} delete 删除user表中的第id条记录

// /get获取
// /post 添加
// /put修改
// /delete删除

//请求和相应的都是Json
//2.接收参数
//3.返回响应

@RestController
//@Controller 标记一个类是Controller ，然后使用@RequestMapping 和@RequestParam 等
// 一些注解用以定义URL 请求和Controller 方法之间的映射，这样的Controller 就能被外界访问到。
@RequestMapping("/rest/user")
//在Spring MVC 中使用 @RequestMapping 来映射请求，也就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
public class RestfulController {
    ////@RequestMapping 中的 method 主要用来定义接收浏览器发来的何种请求。在Spring中，使用枚举类
    @GetMapping
    @ResponseBody
    public List<User> getAllUser(){
        List<User> users=new ArrayList<>();
        for(int i=0;i<10;i++){
            users.add(new User("mt:"+i,"123456",10,"fsds"));
        }
        System.out.println("getAllUser");
        return users;
    }
    //Http规范定义了多种请求资源的方式，最基本的有四种，分别为：GET（查）、POST（增）、PUT（改）、DELETE（删），
    // 而URL则用于定位网络上的资源相当于地址的作用，配合四种请求方式，可以实现对URL对应的资源的增删改查操作。
    //
    //在实际应用中，很多人并没有按照这个规范做，因为使用GET/POST同样可以完成PUT和DELETE操作，甚至GET也可以完成POST操作，
    // 因为GET不需要用到表单，而POST却需要通过表单来发送。
//    @GetMapping("/{id:\\d+}")
    //@PathVariable是spring3.0的一个新功能：接收请求路径中占位符的值
//    public void getUserById(@PathVariable String id){
//        System.out.println(id);
//        System.out.println("getUserById");
//    }
    @ResponseBody
    @GetMapping("/{id:\\d+}")
    public User getUserById(@PathVariable String id){
        return new User("mt:","123456",12,"hsjah");
    }
    @PostMapping
    // @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
    public void addUser(@RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
    @PutMapping("/{id:\\d+}")
    public void updateUserById(@PathVariable String id, @RequestBody User user) {
        System.out.println(id);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteUserById(@PathVariable String id) {
        System.out.println(id);
    }
}
