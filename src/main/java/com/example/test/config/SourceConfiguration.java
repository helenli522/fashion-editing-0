//package com.example.test.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * 文件读取配置
// */
//@Configuration
//public class SourceConfiguration extends WebMvcConfigurerAdapter {
//    @Value("${UPLOADFILE_PATH}")
//    String UPLOADFILE_PATH;
//      @Override
//      public void addResourceHandlers(ResourceHandlerRegistry registry) {
//     /**
//     * @Description: 对文件的路径进行配置,创建一个虚拟路径/file/** ，即只要在<img src="/file/images/20180522/9aa64b2b-a558-421e-929c-537ff0aecdba.jpg" />便可以直接引用图片
//     *这是图片的物理路径 "file:/+本地图片的地址"
//     * @Date： Create in 14:08 2017/12/20
//     *
//     */
//
//
//        registry.addResourceHandler("/file/**").addResourceLocations("file:"+UPLOADFILE_PATH);
//        System.out.println("文件上传目录："+UPLOADFILE_PATH);
//        super.addResourceHandlers(registry);
//      }
//    }
