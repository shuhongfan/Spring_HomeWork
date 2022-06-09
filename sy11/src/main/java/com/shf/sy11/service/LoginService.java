package com.shf.sy11.service;


import org.apache.ibatis.annotations.Param;

public interface LoginService {
    int checkUserNameAndPassword(String username,String password);

    int insertUserNameAndPassword(String username, String password);
}
