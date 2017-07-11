package com.terry;


/***
 * *
 * 名称：     User.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/11.
 * 说明：     
 * *
 ***/

public class User {

    public Integer id;
    public String name, img = "http://up.qqjia.com/z/16/tu17317_45.png", sex = "girl";
    public int age = 20;
    public Long time;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

}
