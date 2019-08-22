package com.morning.demo.service.impl;

import com.morning.demo.entity.Message;
import com.morning.demo.repository.MessageRepository;
import com.morning.demo.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @ClassName MessageServiceImplent
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:34
 * @Version 1.0
 **/
@Service
@Transactional
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public void save(Message message) {

        try {
            messageRepository.save(message);
        } catch (Exception e) {
            log.info("保存message异常{}", e);
            e.printStackTrace();
        }
    }
}
