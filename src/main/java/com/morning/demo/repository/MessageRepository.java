package com.morning.demo.repository;

import com.morning.demo.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName MessageRepository
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:22
 * @Version 1.0
 **/

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
