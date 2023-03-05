package com.example.mapper;

import com.example.entity.User;

import java.util.List;

public interface UserMapper1 {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsernameAndPassword(User user);
    User selectByAdd(User user);
    User selectByDelete(User user);
    User selectByModify(User user);
}
