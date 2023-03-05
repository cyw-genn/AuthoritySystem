package com.example.service.impl;

import com.example.entity.Role;
import com.example.mapper.RoleMapper;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findAll(){
        return roleMapper.findAll();
    }

    @Override
    public int save(Role role){
        return roleMapper.save(role);
    }

    @Override
    public Integer delete(int id){
        return roleMapper.delete(id);
    }

    @Override
    public Role get(int id){
        return roleMapper.get(id);
    }

    @Override
    public int update(Role role){
        return roleMapper.update(role);
    }
}
