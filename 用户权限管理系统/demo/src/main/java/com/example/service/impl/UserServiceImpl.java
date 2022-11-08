package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }

    @Override
    public int save(User user){
        return userMapper.save(user);
    }

    @Override
    public Integer delete(int id){
        return userMapper.delete(id);
    }

    @Override
    public User get(int id){
        return userMapper.get(id);
    }

    @Override
    public int update(User user){
        return userMapper.update(user);
    }
}
