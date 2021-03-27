package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Line;
import com.example.test.bean.Ornament;
import com.example.test.common.ImageUtils;
import com.example.test.service.OrnamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrnamentController {
    @Autowired
    OrnamentService ornamentService;

//    @GetMapping("/ornament/getAll")
//    public CommonResult getOrnaments() {
//        List<Ornament> ornaments = ornamentService.getOrnaments();
//        if(ornaments==null)
//            return new CommonResult(400,"there is no ornament",null);
//        return new CommonResult(200,null,ornaments);
//    }

    @GetMapping("/ornament/getAll")
    public CommonResult getOrnaments() {
        List<Ornament> ornaments = ornamentService.getOrnaments();
        for(Ornament ornament : ornaments){
            String url = ornament.getImageUrl();
            String base64 = ImageUtils.image2Base64(url);
            ornament.setImageUrl(base64);
        }
        if(ornaments == null)
            return new CommonResult(400,"there is no ornament",null);
        return new CommonResult(200,null,ornaments);
    }


}
