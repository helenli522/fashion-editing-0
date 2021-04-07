package com.example.test.controller;

import com.example.test.bean.Work;
import com.example.test.common.Base64ToImg;
import com.example.test.common.ImageUtil;
import com.example.test.common.ImageUtils;
import com.example.test.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class ImageDetectController {

    @Autowired
    WorkService workService;

    /**
     * detect
     *
     * @return detect.html
     */
    @RequestMapping(value = "/detect", method = RequestMethod.GET)
    public String detect() {

        return "detect";
    }

    /**
     * detect out
     *
     * @param imageLink
     * @return detectOut.html
     */
    @RequestMapping(value = "/detectImage", method = RequestMethod.POST)
    public ModelAndView detectOut(String imageLink) {

        // step 1. detect image by imageUrl
        String detectFrame = ImageUtils.image2Base64(imageLink);

        // step 2. assemble modelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("detectOut");
        modelAndView.addObject("img", detectFrame);

        // step 3. return detect result page
        return modelAndView;
    }

    @PostMapping("/Base64Toimg2")
    public String Base64Toimg2(@RequestParam("base64str")String base64str) throws IOException {
//        String s1 = "F:\\jiao_now\\FashionEditing\\";
        String s1 = "/home/ubuntu/image/";
        String s2 = ".png";
        List<Work> works = workService.getAllWork();
        int num = works.size() + 1;
        String imgPath = s1 + num + s2;
        Boolean bl = Base64ToImg.GenerateImage(base64str, imgPath); //原图片存到本地
        String res = "";
        if (bl){
            String savePath = s1 + "work" + num + s2; //压缩后的图片
            res = "http://1.15.114.144:8080/photo/" + "work" + num + s2;

            ImageUtil.reSize(new File(imgPath), new File(savePath), 256,256, true);
            workService.insertWork(res);
        }
        return res;
    }


}