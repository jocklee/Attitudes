package com.morning.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName UserInfo
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 11:41
 * @Version 1.0
 **/
@Entity
@Data
public class Message {

    @Id
    @GeneratedValue
    private Integer id;

    private Long messageId;

    private String createdAt;

    private String source;

    private Long  userId;





}
