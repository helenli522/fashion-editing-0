package com.example.test.controller;

import com.example.test.common.ImageUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ImageDetectController {

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



}