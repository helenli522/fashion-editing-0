package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Line;
import com.example.test.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LineController {
    @Autowired
    private LineService lineService;

    @ResponseBody
    @RequestMapping("/line/getAll")
    public CommonResult getLines() {
        List<Line> lines = lineService.getLines();
        if(lines==null)
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
