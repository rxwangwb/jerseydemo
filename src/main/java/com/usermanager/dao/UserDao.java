package com.usermanager.dao;


import com.usermanager.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> selectAllUsers();
}