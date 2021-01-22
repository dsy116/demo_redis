package com.offcn.service;

import com.alibaba.fastjson.JSON;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StringRedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void store(){
        User user = new User(2020001, "小黑", 12);
        String json = JSON.toJSONString(user);
        stringRedisTemplate.opsForValue().set("name",json);
    }

    public User get(){
        String str = stringRedisTemplate.opsForValue().get("name");
        User user = JSON.parseObject(str, User.class);
        return user;

    }





}
