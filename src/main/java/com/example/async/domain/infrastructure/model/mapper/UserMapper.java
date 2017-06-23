package com.example.async.domain.infrastructure.model.mapper;

import com.example.async.domain.infrastructure.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserMapper {

    @Select("select * from User where username = #{name}")
    User findbyName(@Param("name") String name);
}
