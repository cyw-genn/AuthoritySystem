package com.example.service;

import com.example.entity.RoleFea;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleFeaService {
    List<RoleFea> findAll();
    int save(RoleFea roleFea);
    Integer delete(int id);
    RoleFea get(int id);
    int update(RoleFea roleFea);
}
