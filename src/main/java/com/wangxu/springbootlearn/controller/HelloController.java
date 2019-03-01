package com.wangxu.springbootlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootlearn.controller
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/2/28 11:30
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
