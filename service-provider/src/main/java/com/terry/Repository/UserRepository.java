package com.terry.Repository;

import com.terry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * *
 * 名称：     UserRepository.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/11.
 * 说明：     
 * *
 ***/

public interface UserRepository extends JpaRepository<User, Integer> {
}
