package com.morning.demo.entity;

import lombok.Data;

/**
 * @ClassName MessageDto
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:43
 * @Version 1.0
 **/
@Data
public class MessageDTO {

    private Long id;

    private String created_at;

    private String source;

    private UserDTO user;
}
