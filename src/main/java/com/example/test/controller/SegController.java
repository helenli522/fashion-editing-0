package com.example.test.controller;

import com.example.test.bean.CommonResult;
import com.example.test.bean.Ornament;
import com.example.test.bean.Seg;
import com.example.test.service.SegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SegController {
    @Autowired
    SegService segService;

    @GetMapping("/seg/getAll")
    public CommonResult getSeg() {
        List<Seg> segs = segService.getALLSeg();
        if(segs == null)
            return new CommonResult(400,"there is no seg",null);
        return new CommonResult(200,null,segs);
    }
}
