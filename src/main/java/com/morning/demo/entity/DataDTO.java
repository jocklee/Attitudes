package com.morning.demo.entity;

import lombok.Data;

import java.util.ArrayList;

/**
 * @ClassName MessageDTO
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:40
 * @Version 1.0
 **/
@Data
public class DataDTO {

    private Integer max;

    private Integer total_number;

    private ArrayList<MessageDTO> data;
}
