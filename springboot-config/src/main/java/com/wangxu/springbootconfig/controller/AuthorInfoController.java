package com.wangxu.springbootconfig.controller;

import com.wangxu.springbootconfig.config.ConfigBean;
import com.wangxu.springbootconfig.config.CustomConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootconfig.controller
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/1 14:01
 */
@RestController
public class AuthorInfoController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/")
    public String AuthorInfoController(){
        return "name:"+name;
    }

    @RequestMapping("/configBean")
    public String ConfigBeanController(){
        return configBean.getGreeting()+" >>>>"+ configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+ configBean.getMax();
    }

    @Autowired
    private CustomConfigBean customConfigBean;
    @RequestMapping("/customConfigBean")
    public String CustomconfigBeanController(){
        return customConfigBean.getGreeting()+" >>>>"+ customConfigBean.getName()+" >>>>"+ customConfigBean.getUuid()+" >>>>"+ customConfigBean.getMax();
    }

}
