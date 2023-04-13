package com.tian.controller;

import com.tian.mapper.UserMapper;
import com.tian.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/queryAll")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/queryById/{id}")
    public User queryUserById(@PathVariable("id") int id){
        User user = userMapper.queryUserById(id);
        return user;
    }

    //springboot帮我们自动提交，并处理了事务
    @RequestMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(7, "小田", "666666"));
        return "add ok";
    }

    @RequestMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(6, "小新", "000888"));
        return "update ok";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userMapper.deleteUser(id);
        return "delete ok";
    }

}
