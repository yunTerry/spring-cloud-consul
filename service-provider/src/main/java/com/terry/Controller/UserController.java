package com.terry.Controller;

import com.terry.Repository.UserRepository;
import com.terry.User;
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
    UserRepository userRepository;

    @PostMapping("/user")
    User addUser(@RequestBody User user) {
        user.id = null;
        user = userRepository.save(user);
        return user;
    }

    @GetMapping("/getauser")
    User getUser(@RequestParam("id") Integer id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/user")
    List<User> getAllUser() {
        return userRepository.findAll();
    }

    @DeleteMapping("/user")
    void deleteUser(@RequestParam("id") Integer id) {
        userRepository.delete(id);
    }

}
