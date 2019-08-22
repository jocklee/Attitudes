package com.morning.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 11:46
 * @Version 1.0
 **/
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long userId;
    private String screenName;

    private String profileImageUrl;

    private boolean verified;

    private Integer verifiedType;

    private Integer followersCount;

    private Integer mbtype;

    private String profileUrl;

    private String remark;

    private boolean following;

    private boolean followMe;

    private Integer verifiedTypeExt;
}
