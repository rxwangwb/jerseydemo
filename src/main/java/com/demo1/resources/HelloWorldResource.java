package com.demo1.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 打印HelloWord
 * 浏览器地址：http://localhost:8080/jerseydemo/rest/helloworld
 */

@Path("/helloworld")
public class HelloWorldResource {

    @GET
    public String sayHelloWorld(){
        return "Hello World! It's Jersey 2!";
    }
}
