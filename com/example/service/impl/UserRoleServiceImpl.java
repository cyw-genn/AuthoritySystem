package com.example.service.impl;

import com.example.entity.UserRole;
import com.example.mapper.UserRoleMapper;
import com.example.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Override
    public List<UserRole> findAll(){
        return userRoleMapper.findAll();
    }

    @Override
    public int save(UserRole userRole){
        return userRoleMapper.save(userRole);
    }

    @Override
    public Integer delete(int id){
        return userRoleMapper.delete(id);
    }

    @Override
    public UserRole get(int id){
        return userRoleMapper.get(id);
    }

    @Override
    public int update(UserRole userRole){
        return userRoleMapper.update(userRole);
    }
}
