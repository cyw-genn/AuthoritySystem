package com.example.service;

import com.example.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> findAll();
    int save(Role role);
    Integer delete(int id);
    Role get(int id);
    int update(Role role);
}
