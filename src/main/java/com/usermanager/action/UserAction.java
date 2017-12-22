package com.usermanager.action;

import com.usermanager.pojo.User;
import com.usermanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserAction {
    @Autowired
    private IUserService userService;

    public String selectAllUsers() {
        List<User> userList = userService.selectAllUsers();
        System.out.println(userList.size());
        return "SUCCESS";
    }
}
