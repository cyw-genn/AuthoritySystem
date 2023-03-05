package com.example.service;

import com.example.entity.Function;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FunctionService {
    List<Function> findAll();
    int save(Function function);
    Integer delete(int id);
    Function get(int id);
    int update(Function function);
}
