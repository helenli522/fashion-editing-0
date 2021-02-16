package com.example.test.mapper;

import com.example.test.bean.Line;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LineMapper {
    //根据LID获取线条
    @Select("select * from Line where LID=#{LID}")
    public Line getLineByLID(Integer LID);

//    获取全部线条列表
    @Select("select * from Line")
    public List<Line> getLines();

//    根据类别获取线条
    @Select("select * from Line where LType=#{LType}")
    public List<Line> getLinesByLType(Integer LType);

//    根据性别获取线条
    @Select("select * from Line where LGender=#{LGender}")
    public List<Line> getLinesByLGender(String LGender);

//    根据类别和性别获取线条
    @Select("select * from Line where LType=#{LType} and LGender=#{LGender}")
    public List<Line> getLinesByLTypeAndLGender(Integer LType,String LGender);

}
