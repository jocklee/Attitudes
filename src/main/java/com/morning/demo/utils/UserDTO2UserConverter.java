package com.morning.demo.utils;

import com.morning.demo.entity.User;
import com.morning.demo.entity.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName UserDTO2UserConverter
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 15:18
 * @Version 1.0
 **/

public class UserDTO2UserConverter {

    public static User convert(UserDTO userDTO) {

        User user = new User();
        user.setUserId(userDTO.getId());
        user.setScreenName(userDTO.getScreen_name());
        user.setProfileImageUrl(userDTO.getProfile_image_url());
        user.setVerified(userDTO.isVerified());
        user.setVerifiedType(userDTO.getVerified_type());
        user.setFollowersCount(userDTO.getFollowers_count());
        user.setMbtype(userDTO.getMbtype());
        user.setProfileUrl(userDTO.getProfile_url());
        user.setRemark(userDTO.getRemark());
        user.setFollowing(userDTO.isFollowing());
        user.setFollowMe(userDTO.isFollow_me());
        user.setVerifiedTypeExt(userDTO.getVerified_type_ext());
        return user;
    }

    public static List<User> convert(List<UserDTO> userDTOList) {
        return userDTOList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
