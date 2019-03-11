package com.wangxu.springbootbeatlsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.wangxu.springbootbeatlsql.dao","com.wangxu.springbootbeatlsql.controller"})
public class SpringbootBeatlsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBeatlsqlApplication.class, args);
    }

}
