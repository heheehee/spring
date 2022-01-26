package net.seehope.springboot.web.controller;

import net.seehope.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/thyme")
public class ThymeController {

    @GetMapping("/1")
    public String showThy(ModelMap modelMap){
        modelMap.addAttribute("username","mt");
        modelMap.addAttribute("style","color:red");
        modelMap.addAttribute("disc","<a href='http://www.baidu.com'>百度一下</a>");
        List<User> userList=new ArrayList<User>();
        for(int i=0;i<20;i++){
            User user=new User();
          user.setUsername("hehee"+i);
          user.setBirthday(new Date());
           user.setId(i);
           userList.add(user);
        }
        modelMap.addAttribute("users",userList);
        return "test";
    }
    @GetMapping("/2")
    public ModelAndView showThymeLeaf(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","mt");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
