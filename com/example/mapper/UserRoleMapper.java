package com.example.mapper;

import com.example.entity.UserRole;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserRoleMapper {
    @Select("select * from userrole")
    List<UserRole> findAll();

    @Insert("insert into userrole (id,userID,roleID) values(#{id},#{userID},#{roleID})")
    public int save(UserRole userRole);

    @Delete("delete from userrole where id=#{id}")
    public int delete(int id);

    @Select("select * from userrole where id=#{id}")
    public UserRole get(int id);

    @Update("update userrole set userID=#{userID},roleID=#{roleID} where id=#{id}")
    public int update(UserRole userRole);
}
