package net.seehope.springboot.web.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import net.seehope.springboot.pojo.User;
import net.seehope.springboot.util.JsonResult;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/redis")
@AllArgsConstructor
public class RedisController {
    private RedisTemplate<String,String> redisTemplate;
    private ObjectMapper objectMapper;

    @GetMapping("/set")
    public JsonResult setRedis() throws JsonProcessingException {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("123");
            users.add(user);
        }
        redisTemplate.opsForValue().set("user:all", objectMapper.writeValueAsString(users));
        return JsonResult.ok("hello redis");
    }

    @GetMapping("/get")
    public JsonResult getRedis() throws JsonProcessingException {
//        objectMapper.read
//        User user = objectMapper.readValue(redisTemplate.opsForValue().get("user:all"), ArrayList<>);
//        System.out.println(user);
        return JsonResult.ok(null);
    }
}
