package com.terry;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/***
 * *
 * 名称：     RestAPI.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/11.
 * 说明：     
 * *
 ***/

@FeignClient("user-service-provider")
public interface RestAPI {

    @PostMapping("/user")
    User addUser(@RequestBody User user);

    @GetMapping("/getauser")
    User getUser(@RequestParam("id") Integer id);

    @GetMapping("/user")
    List<User> getAllUser();

}
