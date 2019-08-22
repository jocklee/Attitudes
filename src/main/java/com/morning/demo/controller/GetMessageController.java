package com.morning.demo.controller;

import com.morning.demo.DemoApplication;
import com.morning.demo.entity.ResultDTO;
import com.morning.demo.entity.User;
import com.morning.demo.repository.UserRepository;
import com.morning.demo.service.UserService;
import com.morning.demo.utils.JacksonJsonUtil;
import com.morning.demo.utils.UserDTO2UserConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName GetMessageController
 * @Description TODO
 * @Author like
 * @Data 2019/8/21 13:47
 * @Version 1.0
 **/
@RestController
@Slf4j
public class GetMessageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;
    private final Integer max = 300;

    @GetMapping("/getMsg")
    public String getMsg(Integer num) {

        for (int i =num ; i <= max; i++) {
            String url = "https://m.weibo.cn/api/attitudes/show?id=4407121917096674&page=" + i + "";
            HttpHeaders headers = new HttpHeaders();
            headers.add("User-Agent", "Chrome/69.0.3497.81 Safari/537.36");
            headers.add("cookie","SCF=Avx6_Um39FV_1JzgKZSZf1Ae7gjCbaIePDmYJekDpJOdJjrCwvLx-0cNLQofNhZNWPvm8byTvv-jkE2W03Gkq-A.; SUB=_2A25wWNorDeRhGeRH41cQ8ybPzzmIHXVTouZjrDV6PUNbktAKLU_nkW1NTYX5HQW2fCSOZKbDEZCcuSv_o7Yvj-8-; WEIBOCN_FROM=1110006030; M_WEIBOCN_PARAMS=luicode%3D10000011%26lfid%3D1076035590942962");
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            String responseStr = resp.getBody().toString();
            ResultDTO resultDTO = new ResultDTO();
            try {
                resultDTO = JacksonJsonUtil.json2pojo(responseStr, ResultDTO.class);
                log.info("第{}页数据获取并解析成功", i);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

            }

            User user = new User();
            List<User> userList = new ArrayList<User>();
            resultDTO.getData().getData().stream().forEach(e -> {
                userList.add(UserDTO2UserConverter.convert(e.getUser()));
            });

            userService.saveAll(userList);
            log.info("第{}页数据保存成功", i);
        }
        return "终于成功了!!!";
    }
}

