package net.seehope.ssm.web.controller;
import lombok.AllArgsConstructor;
import net.seehope.ssm.mapper.UserMapper;
import net.seehope.ssm.pojo.User;
import net.seehope.ssm.pojo.vo.UserQueryVo;
import net.seehope.ssm.service.UserService;
import net.seehope.ssm.service.impl.UserServiceImpl;
import net.seehope.ssm.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserService userService;


    @GetMapping
    public JsonResult getAllUser(){
        return JsonResult.isOk(userService.getAllUser());
    }
    @GetMapping("/{id:\\d+}")
    public JsonResult  getUserById(@PathVariable Integer id){
        return JsonResult.isOk(userService.getUserById(id));
    }
    @GetMapping("/{name}")
    public JsonResult getUserLikeName(@PathVariable String name){
        return JsonResult.isOk(userService.getUserLikeName(name));
    }
    @GetMapping("/a")
    public JsonResult insertUser(){
        User user=new User(1, "hehee", new Date(), 'm', "12312", "fdsa", "dasfs");
        return JsonResult.isOk(userService.insertUser(user));

    }
    @GetMapping("/b")
    public JsonResult queryUserByHashMap(){
        Map<String, String> params = new HashMap<>();
        params.put("username", "mt");
        params.put("address", "10");
        return JsonResult.isOk(userService.queryUserByHashMap(params));
    }
    @GetMapping("/c")
    public JsonResult queryUserByVo(){
        UserQueryVo vo = new UserQueryVo();
        vo.setUser(new User(1, null, null,
                null, "12312", null, null));
        return JsonResult.isOk(userService.queryUserByVo(vo));
    }
    @GetMapping("/d")
    public JsonResult updateUserByVo(){
        UserQueryVo vo = new UserQueryVo();
        vo.setUser(new User(3, "hehee", null,
                null, "sdhsidhis", "12345667", null));
        return JsonResult.isOk(userService.updateUserByVo(vo));
    }
    @GetMapping("/e")
    public JsonResult deleteUserByVo(){
        UserQueryVo vo = new UserQueryVo();
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(24);
        vo.setIds(ids);
       return JsonResult.isOk(userService.deleteUserByVo(vo));
    }


}
