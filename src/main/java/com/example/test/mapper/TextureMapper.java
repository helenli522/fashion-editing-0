package com.example.test.mapper;

import com.example.test.bean.Line;
import com.example.test.bean.Texture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TextureMapper {
    //根据TID获取纹理
    @Select("select * from Texture where TID=#{TID}")
    public Texture getTextureByTID(Integer TID);

//    获取纹理列表
    @Select("select * from Texture")
    public List<Texture> getTextures();
}
