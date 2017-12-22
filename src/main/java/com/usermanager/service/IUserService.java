package com.usermanager.service;


import com.usermanager.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUsers();
}
