package com.morning.demo.entity;

import lombok.Data;

/**
 * @ClassName ResultDTO
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:47
 * @Version 1.0
 **/
@Data
public class ResultDTO {

    private Integer ok;

    private String msg;

    private DataDTO data;
}
