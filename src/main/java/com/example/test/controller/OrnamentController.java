package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Line;
import com.example.test.bean.Ornament;
import com.example.test.service.OrnamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrnamentController {
    @Autowired
    OrnamentService ornamentService;

    @ResponseBody
    @RequestMapping("/ornament/getAll")
    public CommonResult getLines() {
        List<Ornament> ornaments = ornamentService.getOrnaments();
        if(ornaments==null)
            return new CommonResult(400,"there is no ornament",null);
        return new CommonResult(200,null,ornaments);
    }

}
