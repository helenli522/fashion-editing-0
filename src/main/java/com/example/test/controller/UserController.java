package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.User;
import com.example.test.service.EmailService;
import com.example.test.service.UserService;
import org.apache.commons.codec.binary.Base64;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    JavaMailSenderImpl mailSender;
    @Autowired
    EmailService emailService;

    @PostMapping("/user/login")
    public CommonResult login(@RequestBody User user){
        if (user.getName() == null){
            return new CommonResult(500,"empty",null);
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getName(),
                user.getPassword()
        );
        try {
            subject.login(usernamePasswordToken);
        } catch(AuthenticationException e){
            return new CommonResult(500,"wrong",null);
        }
        String name = (String) SecurityUtils.getSubject().getPrincipal();
        User user1 = userService.getUserByName(name);
        return new CommonResult(200,"success",user1);
    }

    @PostMapping("/user/logout")
    public CommonResult logout(){
        return new CommonResult(200,"logout success",null);
    }

    @PostMapping("/user/register")
    public CommonResult register(@RequestParam("string1")String string1, @RequestParam("string2")String string2, @RequestBody User user){
        User user1 = userService.getUserByEmail(user.getEmail());
        if(user1 != null){
            return new CommonResult(500,"email alreadt exists!",null);
        }
        User user2 = userService.getUserByName(user.getName());
        if(user2 != null){
            return new CommonResult(400,"username already exists!", null);
        }
        String base64 = Base64.encodeBase64URLSafeString(string1.getBytes());
        if(!base64.equals(string2)){
            return new CommonResult(300,"code error!",null);
        }
        User res = userService.Register(user);
        System.out.println("R1:User = " + user.toString());
        return new CommonResult(200,null,res);
    }

}
