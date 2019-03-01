package com.wangxu.springbootconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootconfig.config
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/3/1 14:12
 */
@Configuration
//@PropertySource("classpath:test.properties")无法加载yaml文件
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "myprops")

//@Component
public class CustomConfigBean {
    /**
     *   name: wangxu
     *   age: 22
     *   number:  ${random.int}
     *   uuid : ${random.uuid}
     *   max: ${random.int(10)}
     *   value: ${random.value}
     *   greeting: hi,i'm  ${my.name}
     */
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
