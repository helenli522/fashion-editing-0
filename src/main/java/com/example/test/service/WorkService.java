package com.example.test.service;

import com.example.test.bean.Work;
import com.example.test.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {
    @Autowired
    WorkMapper workMapper;

    public List<Work> getAllWork(){
        return workMapper.getWorks();
    }

    public int insertWork(String ImageUrl){
        Integer num = getAllWork().size();
        return workMapper.insertWork(num+1, ImageUrl);
    }
}
