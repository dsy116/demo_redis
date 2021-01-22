package com.offcn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void store(){
        redisTemplate.boundHashOps("redis").put("name","小白");
    }

    public String get(){
       return  (String)redisTemplate.boundHashOps("redis").get("name");
    }



}
