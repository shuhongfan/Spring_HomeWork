package com.shf.sy11.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    @Select("select count(*) from user where username=#{username} and password=#{password}")
    int checkUserNameAndPassword(@Param("username") String username,
                                 @Param("password") String password);

    @Insert("insert into user (username,password) values (#{username},#{password});")
    int insertUserNameAndPassword(@Param("username") String username,
                                 @Param("password") String password);

}
