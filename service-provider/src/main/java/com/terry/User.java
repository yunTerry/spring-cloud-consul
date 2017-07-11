package com.terry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/***
 * *
 * 名称：     User.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/11.
 * 说明：     
 * *
 ***/

@Entity
public class User {

    @Id
    @GeneratedValue
    public Integer id;
    public String name, img, sex;
    public int age;
    public Long time;

}
