package com.usermanager.service.impl;

import com.usermanager.dao.UserDao;
import com.usermanager.pojo.User;
import com.usermanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    public List<User> selectAllUsers() {
        return userDao.selectAllUsers();
    }
}
