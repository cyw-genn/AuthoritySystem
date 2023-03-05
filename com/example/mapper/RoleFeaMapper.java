package com.example.mapper;

import com.example.entity.RoleFea;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleFeaMapper {
    @Select("select * from rolefeature")
    List<RoleFea> findAll();

    @Insert("insert into rolefeature (id,roleID,feaID) values(#{id},#{roleID},#{feaID})")
    public int save(RoleFea roleFea);

    @Delete("delete from rolefeature where id=#{id}")
    public int delete(int id);

    @Select("select * from rolefeature where id=#{id}")
    public RoleFea get(int id);

    @Update("update rolefeature set roleID=#{roleID},feaID=#{feaID} where id=#{id}")
    public int update(RoleFea roleFea);
}
