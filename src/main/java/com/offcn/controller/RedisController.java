package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.RedisService;
import com.offcn.service.StringRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StringRedisService stringRedisService;

    @RequestMapping("/store")
    public void store(){
        stringRedisService.store();
    }

    @GetMapping("/get")
    public User get(){
        return stringRedisService.get();
    }

}
