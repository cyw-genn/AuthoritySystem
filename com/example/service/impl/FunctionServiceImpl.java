package com.example.service.impl;

import com.example.entity.Function;
import com.example.mapper.FunctionMapper;
import com.example.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FunctionServiceImpl implements FunctionService {
    @Autowired
    private FunctionMapper functionMapper;
    @Override
    public List<Function> findAll(){
        return functionMapper.findAll();
    }

    @Override
    public int save(Function function){
        return functionMapper.save(function);
    }

    @Override
    public Integer delete(int id){
        return functionMapper.delete(id);
    }

    @Override
    public Function get(int id){
        return functionMapper.get(id);
    }

    @Override
    public int update(Function function){
        return functionMapper.update(function);
    }
}
