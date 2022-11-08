package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user (id,username,password) values(#{id},#{username},#{password})")
    public int save(User user);

    @Delete("delete from user where id=#{id}")
    public int delete(int id);

    @Select("select * from user where id=#{id}")
    public User get(int id);

    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public int update(User user);
}