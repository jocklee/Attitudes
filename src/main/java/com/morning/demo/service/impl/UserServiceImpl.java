package com.morning.demo.service.impl;

import com.morning.demo.entity.User;
import com.morning.demo.repository.UserRepository;
import com.morning.demo.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImplent
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:24
 * @Version 1.0
 **/
@Transactional
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            log.info("保存user异常{}", e);
        }
    }

    @Override
    public void saveAll(List<User> userList) {

        try {
            userRepository.saveAll(userList);
        } catch (Exception e) {
            log.info("批量保存user异常{}", e);
        }

    }
}
