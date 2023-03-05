package com.example.service;

import com.example.entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserRoleService {
    List<UserRole> findAll();
    int save(UserRole userRole);
    Integer delete(int id);
    UserRole get(int id);
    int update(UserRole userRole);
}
