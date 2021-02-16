package com.example.test.mapper;

import com.example.test.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    //根据id获取用户
    @Select("select * from User where UserID=#{UserID}")
    public User getUserById(Integer UserID);

    //根据用户名获取用户
    @Select("select * from User where Name=#{Name}")
    public User getUserByName(String Name);

    //根据邮箱获取用户
    @Select("select * from User where Email=#{Email}")
    public User getUserByEmail(String Email);

    //根据id删除用户
    @Delete("delete from User where UserID=#{UserID}")
    public int deleteUserById(Integer UserID);

    //更新密码
    @Update("update User set Password=#{Password} where UserID=#{UserID}")
    public int updatePassword(User user);

//    更新姓名
    @Update("update User set Name=#{Name} where UserID=#{UserID}")
    public int updateName(User user);

    //    更新邮箱
    @Update("update User set Email=#{Email} where UserID=#{UserID}")
    public int updateEmai(User user);

    //    更新性别
    @Update("update User set Gender=#{Gender} where UserID=#{UserID}")
    public int updateGender(User user);

    //添加用户
    @Options(useGeneratedKeys = true,keyProperty = "UserID")
    @Insert("insert into User(UserID,Name,Password,Email,Gender) values(#{UserID},#{Name},#{Password},#{Email},#{Gender})")
    public int insertUser(User user);
}
