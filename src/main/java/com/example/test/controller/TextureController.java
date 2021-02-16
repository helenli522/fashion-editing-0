package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Line;
import com.example.test.bean.Texture;
import com.example.test.service.TextureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextureController {
    @Autowired
    TextureService textureService;

    @ResponseBody
    @RequestMapping("/texture/getAll")
    public CommonResult getTextures() {
        List<Texture> textures = textureService.getTextures();
        if(textures==null)
            return new CommonResult(400,"there is no texture",null);
        return new CommonResult(200,null,textures);
    }

}
