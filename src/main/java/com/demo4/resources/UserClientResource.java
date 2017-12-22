package com.demo4.resources;

import com.demo4.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通过jersey客户端实现web service的CURD操作，
 * 这里的模拟操作都是在内存中进行的
 */

@Path("/userClientResource")
public class UserClientResource {

    private static Map<String, User> userMap = new HashMap<String, User>();//存储用户

    /**
     * 增加用户
     * Consumes表示可以接受的client发送过来的MIME类型
     *
     * @param user
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @DELETE
    @Path("{id}")
    public void deleteUser(@PathParam("id") String id) {
        userMap.remove(id);
    }

    /**
     * 修改用户信息
     *
     * @param user
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void updateUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    /**
     * 根据id查询指定用户信息
     * MediaType可以指定多个，如果客户端没有指定要返回的类型，则默认是前面那个
     *
     * @param id
     * @return
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User getUserById(@PathParam("id") String id) {
        User u = userMap.get(id);
        return u;
    }

    /**
     * 查询所有用户
     * MediaType可以指定多个，如果客户端没有指定要返回的类型，则默认是前面那个
     *
     * @return
     */
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.addAll(userMap.values());
        return users;
    }

}
