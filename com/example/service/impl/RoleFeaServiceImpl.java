package com.example.service.impl;

import com.example.entity.RoleFea;
import com.example.mapper.RoleFeaMapper;
import com.example.service.RoleFeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleFeaServiceImpl implements RoleFeaService {
    @Autowired
    private RoleFeaMapper roleFeaMapper;
    @Override
    public List<RoleFea> findAll(){
        return roleFeaMapper.findAll();
    }

    @Override
    public int save(RoleFea roleFea){
        return roleFeaMapper.save(roleFea);
    }

    @Override
    public Integer delete(int id){
        return roleFeaMapper.delete(id);
    }

    @Override
    public RoleFea get(int id){
        return roleFeaMapper.get(id);
    }

    @Override
    public int update(RoleFea roleFea){
        return roleFeaMapper.update(roleFea);
    }
}
