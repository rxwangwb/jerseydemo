package com.usermanager.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用户实体类
 *
 * XmlRootElement表示将bean转换为xml，用在实体类中，
 * 如果要将bean以xml或json的格式返回，必须要这个注解
 */
@XmlRootElement
public class User {
    private String userId;
    private String userName;
    private String age;

    public User() {
    }


    public User(String userId, String userName, String age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
