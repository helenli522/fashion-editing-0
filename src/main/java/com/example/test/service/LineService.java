package com.example.test.service;

import com.example.test.bean.Line;
import com.example.test.mapper.LineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {
    @Autowired
    LineMapper lineMapper;

    public Line getLineByLID(Integer LID) {
        return lineMapper.getLineByLID(LID);
    }

    public List<Line> getLines() {
        return lineMapper.getLines();
    }

    public List<Line> getLinesByLType(Integer LType) {
        return lineMapper.getLinesByLType(LType);
    }

    public List<Line> getLinesByLGender(String LGender) {
        return lineMapper.getLinesByLGender(LGender);
    }

    public List<Line> getLinesByLTypeAndLGender(Integer LType,String LGender) {
        return lineMapper.getLinesByLTypeAndLGender(LType,LGender);
    }
}
