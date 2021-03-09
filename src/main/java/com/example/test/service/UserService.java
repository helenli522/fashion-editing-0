package com.example.test.service;

import com.example.test.bean.User;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Register(User user){
        User user1 = userMapper.getUserByName(user.getName());
        User user2 = userMapper.getUserByEmail(user.getEmail());
        if(user1 == null && user2 == null){
            userMapper.insertUser(user);
            return userMapper.getUserByName(user.getName());
        }
        else
            return null;
    }

    //用id搜索用户
    public User getUserById(Integer id) {
        User newUser = userMapper.getUserById(id);
        return newUser;
    }

    //用email搜索用户
    public User getUserByEmail(String email){
        User user =userMapper.getUserByEmail(email);
        return user;
    }

    //用用户名搜索用户
    public User getUserByName(String name){
        User user=userMapper.getUserByName(name);
        return user;
    }

    //删除用户
    public int deleteUser(Integer id) {
        return userMapper.deleteUserById(id);
    }

    //更新密码
    public int updateUserPwd(User user) {
        return userMapper.updatePassword(user);
    }

}
