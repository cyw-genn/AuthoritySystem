package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user values(#{id},#{name},#{password},#{identify},#{qq},#{wechat},#{address},#{telephone},#{email},#{personalpage},#{idtime},#{phonetime},#{mailtime},#{status},#{createtime})")
    public int save(User user);

    @Delete("delete from user where id=#{id}")
    public int delete(int id);

    @Select("select * from user where id=#{id}")
    public User get(int id);

    @Update("update user set name=#{name},password=#{password},identify=#{identify},qq=#{qq},wechat=#{wechat},address=#{address},telephone=#{telephone},email=#{email},personalpage=#{personalpage},idtime=#{idtime},phonetime=#{phonetime},mailtime=#{mailtime},status=#{status},createtime=#{createtime} where id=#{id}")
    public int update(User user);
}
