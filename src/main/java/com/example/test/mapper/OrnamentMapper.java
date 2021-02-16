package com.example.test.mapper;

import com.example.test.bean.Line;
import com.example.test.bean.Ornament;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrnamentMapper {

    //根据OID获取装饰
    @Select("select * from Ornament where OID=#{OID}")
    public Line getOrnamentByOID(Integer OID);

    @Select("select * from Ornament")
    public List<Ornament> getOrnaments();

    //根据类别获取装饰
    @Select("select * from Ornament where OType=#{OType}")
    public List<Ornament> getOrnamentsByOType(Integer OType);
}
