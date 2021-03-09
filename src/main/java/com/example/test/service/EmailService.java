package com.example.test.service;

import com.example.test.bean.CommonResult;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Random;

@Service
public class EmailService {

    @Autowired
    JavaMailSenderImpl mailSender;

    private String emailServiceCode;
    public CommonResult send(String emailTo){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for(int i=0; i<6; i++){
            str.append(random.nextInt(10));
        }
        emailServiceCode = str.toString();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("验证码：");
        message.setText("验证码是："+emailServiceCode);
        message.setFrom("helenli522@163.com");
        message.setTo(emailTo);
        mailSender.send(message);
        //base64简单加密
        String base64 = Base64.encodeBase64URLSafeString(emailServiceCode.getBytes());
        return new CommonResult(200,"发送成功",base64);
    }
}
