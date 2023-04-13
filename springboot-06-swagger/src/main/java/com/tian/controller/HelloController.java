package com.tian.controller;

import com.tian.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    //只要这个实体在请求接口的返回值上（即使是泛型），都能映射到实体项中，即swagger页面的Model栏中
    @PostMapping("/getUser")
    public User getUser(){
        return new User();
    }

    @ApiOperation("狂神的接口")
    @PostMapping("/kuang")
    @ResponseBody
    public String kuang(@ApiParam("这个名字会被返回") String username){
        return username;
    }
}
