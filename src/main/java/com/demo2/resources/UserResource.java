package com.demo2.resources;

import com.demo2.bean.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/userresource")
public class UserResource {
    private static Map<String,User> userMap = new HashMap<String,User>();//存储用户

    /**
     * 查询所有用户
     * Get表示查询检索
     * Produces表示指定将要返回给客户端的数据类型表示
     * @return
     */
    @GET
    @Path("/allUsersXml")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<User>();
        User u1 = new User("001","WayLau","26");
        User u2 = new User("002","King","23");
        User u3 = new User("003","Susan","21");

        userMap.put(u1.getUserId(), u1);
        userMap.put(u2.getUserId(), u2);
        userMap.put(u3.getUserId(), u3);

        users.addAll( userMap.values() );
        return users;
    }

    @GET
    @Path("/singleUserXml")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXml() {
        User user  = new User();
        user.setAge("21");
        user.setUserId("004");
        user.setUserName("Amand");
        return user;
    }
}
