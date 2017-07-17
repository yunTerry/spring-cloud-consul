package com.terry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * *
 * 名称：     UserController.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/11.
 * 说明：     
 * *
 ***/

@RestController
public class UserController {

    @Autowired
    RestAPI restAPI;

    @PostMapping("/user/add/{name}")
    User addUser(@PathVariable("name") String name) {
        User user = new User(name);
        user.time = System.currentTimeMillis();
        return restAPI.addUser(user);
    }

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") Integer id) {
        return restAPI.getUser(id);
    }

    @GetMapping("/user")
    List<User> getUserList() {
        return restAPI.getAllUser();
    }

}
