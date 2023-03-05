package com.example.mapper;

import com.example.entity.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleMapper {
    @Select("select * from role")
    List<Role> findAll();

    @Insert("insert into role (id,roleName) values(#{id},#{roleName})")
    public int save(Role role);

    @Delete("delete from role where id=#{id}")
    public int delete(int id);

    @Select("select * from role where id=#{id}")
    public Role get(int id);

    @Update("update role set roleName=#{roleName} where id=#{id}")
    public int update(Role role);
}