package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Line;
import com.example.test.common.ImageUtils;
import com.example.test.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LineController {
    @Autowired
    private LineService lineService;

//    @GetMapping("/line/getAll")
//    public CommonResult getLines() {
//        List<Line> lines = lineService.getLines();
//        if(lines==null)
//            return new CommonResult(400,"there is no line",null);
//        return new CommonResult(200,null,lines);
//    }

    @GetMapping("/line/getAll")
    public CommonResult getLines() {
        List<Line> lines = lineService.getLines();
        for(Line line : lines){
            String url = line.getImageUrl();
            String base64 = ImageUtils.image2Base64(url);
            line.setImageUrl(base64);
        }
        if(lines == null)
            return new CommonResult(400,"there is no line",null);
        return new CommonResult(200,null,lines);
    }

    @ResponseBody
    @RequestMapping("/line/getLinesByLType")
    public CommonResult getLinesByLType(@RequestParam("LType") int LType) {
        List<Line> lines = lineService.getLinesByLType(LType);
        if(lines==null)
            return new CommonResult(400,"there is no line",null);
        return new CommonResult(200,null,lines);
    }
}
