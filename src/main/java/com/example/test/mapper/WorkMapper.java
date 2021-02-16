package com.example.test.mapper;

import com.example.test.bean.Line;
import com.example.test.bean.User;
import com.example.test.bean.Work;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface WorkMapper {
    //根据WorkID获取作品
    @Select("select * from Work where WorkID=#{WorkID}")
    public Work getWorkByWorkID(Integer WorkID);

//    根据UserID或缺作品列表
    @Select("select * from Work where UserID=#{UserID}")
    public List<Work> getWorksByUserID(Integer UserID);

    //根据WorkID删除作品
    @Delete("delete from Work where WorkID=#{WorkID}")
    public int deleteWorkByWorkId(Integer WorkID);

    //添加作品
    @Insert("insert into Work(WorkID,UserID,LID,TID,ImageUrl) values(#{WorkID},#{UserID},#{LID},#{TID},#{ImageUrl})")
    public int insertWork(Work work);
}

