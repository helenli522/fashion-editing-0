package com.example.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfig implements WebMvcConfigurer {
    @Value("${file.upload.path}")
    private String filePath;
    @Value("${file.upload.path.relative}")
    private String fileRelativePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler(fileRelativePath).addResourceLocations("file:"+filePath);
    }
}
