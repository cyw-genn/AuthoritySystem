package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> findAll();
    int save(User user);
    Integer delete(int id);
    User get(int id);
    int update(User user);
}
