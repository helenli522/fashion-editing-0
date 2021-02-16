package com.example.test.service;

import com.example.test.bean.Line;
import com.example.test.bean.Ornament;
import com.example.test.mapper.OrnamentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrnamentService {
    @Autowired
    OrnamentMapper ornamentMapper;

    public List<Ornament> getOrnaments() {
        return ornamentMapper.getOrnaments();
    }

    public List<Ornament> getOrnamentsByOType(Integer OType) {
        return ornamentMapper.getOrnamentsByOType(OType);
    }
}
