package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user/register")
    public CommonResult register(@RequestBody User user){
        if (user.getGender()==null){
            user.setGender("");
        }
        User user1 = userService.getUserByEmail(user.getEmail());
        if(user1 != null){
            return new CommonResult(500,"email already exists!",null);
        }
        User user2 = userService.getUserByName(user.getName());
        if(user2 != null){
            return new CommonResult(400,"username already exists!",null);
        }
        User result = userService.Register(user);
        return new CommonResult(200,null,result);
    }

    @RequestMapping(value="/user/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user){
        User user1 = userService.getUserByName(user.getName());
        if(user1 != null && user.getPassword().equals(user1.getPassword())){
            return new CommonResult(200,"success",user1);
        }
        else {
            return new CommonResult(500,"failure",null);
        }
    }


}
