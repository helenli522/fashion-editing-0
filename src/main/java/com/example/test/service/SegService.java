package com.example.test.service;

import com.example.test.bean.Seg;
import com.example.test.mapper.SegMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegService {
    @Autowired
    SegMapper segMapper;

    public List<Seg> getALLSeg(){
        return segMapper.getAll();
    }
}
