package com.example.test.mapper;

import com.example.test.bean.Seg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SegMapper {
    @Select("select * from Seg")
    public List<Seg> getAll();
}
