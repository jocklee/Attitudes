package com.morning.demo.repository;

import com.morning.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:21
 * @Version 1.0
 **/

public interface UserRepository extends JpaRepository<User,Integer> {


}
