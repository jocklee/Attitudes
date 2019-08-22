package com.morning.demo.entity;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @ClassName UserDTO
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 14:44
 * @Version 1.0
 **/
@Data
public class UserDTO {

    private Long id;

    private String screen_name;

    private String profile_image_url;

    private boolean verified;

    private Integer verified_type;

    private Integer followers_count;

    private Integer mbtype;

    private String profile_url;

    private String remark;

    private boolean following;

    private boolean follow_me;

    private Integer verified_type_ext;


}
