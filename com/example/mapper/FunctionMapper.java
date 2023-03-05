package com.example.mapper;

import com.example.entity.Function;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface FunctionMapper {
    @Select("select * from feature")
    List<Function> findAll();

    @Insert("insert into feature (id,feaName,upperID) values(#{id},#{feaName},#{upperID})")
    public int save(Function function);

    @Delete("delete from feature where id=#{id}")
    public int delete(int id);

    @Select("select * from feature where id=#{id}")
    public Function get(int id);

    @Update("update feature set feaName=#{feaName},upperID=#{upperID} where id=#{id}")
    public int update(Function function);
}
