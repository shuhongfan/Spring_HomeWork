package com.shf.sy11.service.impl;

import com.shf.sy11.dao.LoginDao;
import com.shf.sy11.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public int checkUserNameAndPassword(String username,String password) {
        return loginDao.checkUserNameAndPassword(username,password);
    }

    @Override
    public int insertUserNameAndPassword(String username, String password) {
        return loginDao.insertUserNameAndPassword(username, password);
    }
}
