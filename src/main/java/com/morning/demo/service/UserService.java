package com.morning.demo.service;

import com.morning.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:23
 * @Version 1.0
 **/

public interface UserService {

    void save(User user);

    void saveAll(List<User> userList);
}
