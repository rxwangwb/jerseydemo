package com.demo4.client;


import com.usermanager.pojo.User;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UserClient {
    private static String serverUri = "http://localhost:8080/jerseydemo/rest";

    /**
     * @param args
     */
    public static void main(String[] args) {
        addUser();
        getAllUsers();
        updateUser();
        getUserById();
        getAllUsers();
        delUser();
        getAllUsers();

    }

    /**
     * 添加用户(以Json的格式向web service发送请求)
     */
    private static void addUser() {
        System.out.println("****增加用户addUser****");
        User user = new User("006", "Susan", "21");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(serverUri + "/userClientResource");
        //指定请求的参数类型,target.request(). 后面跟的是请求的方法:POST，GET，PUT或DELETE
        Response response = target.request().buildPost(Entity.entity(user, MediaType.APPLICATION_JSON)).invoke();
        System.out.println("增加用户Susan...");
        response.close();
    }

    /**
     * 删除用户
     */
    private static void delUser() {
        System.out.println("****删除用户****");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(serverUri + "/userClientResource/006");
        //target.request(). 后面跟的是请求的方法:POST，GET，PUT或DELETE
        Response response = target.request().delete();
        System.out.println("删除ID为006的用户...");
        response.close();
    }


    /**
     * 修改用户
     */
    private static void updateUser() {
        System.out.println("****修改用户updateUser****");
        User user = new User("006", "Susan", "33");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(serverUri + "/userClientResource");
        //target.request(). 后面跟的是请求的方法:POST，GET，PUT或DELETE
        Response response = target.request().buildPut(Entity.entity(user, MediaType.APPLICATION_XML)).invoke();
        System.out.println("修改Susan的年龄为33...");
        response.close();
    }

    /**
     * 根据id查询用户
     */
    private static void getUserById() {
        System.out.println("****根据id查询用户****");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(serverUri + "/userClientResource/006");
        //target.request(). 后面跟的是请求的方法:POST，GET，PUT或DELETE
        Response response = target.request().get();
        User user = response.readEntity(User.class);
        System.out.println("用户ID：" + user.getUserId() + "，用户姓名：" + user.getUserName() + "，用户年龄：" + user.getAge());
        response.close();
    }

    /**
     * 查询所有用户
     */
    private static void getAllUsers() {
        System.out.println("****查询所有getAllUsers****");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(serverUri + "/userClientResource");
        // 使用默认的返回类型,target.request(). 后面跟的是请求的方法:POST，GET，PUT或DELETE
        Response response = target.request().get();
        //指定返回为json格式
        //Response response = target.request(MediaType.APPLICATION_JSON).get();
        String value = response.readEntity(String.class);
        System.out.println(value);
        response.close();  //关闭连接
    }
}
