package com.example.test.service;

import com.example.test.bean.Texture;
import com.example.test.mapper.TextureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextureService {
    @Autowired
    TextureMapper textureMapper;

    public List<Texture> getTextures(){
        return textureMapper.getTextures();
    }
}
