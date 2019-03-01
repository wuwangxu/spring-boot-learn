package com.wangxu.springbootconfig;

import com.wangxu.springbootconfig.config.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootConfigApplication {

    @Bean
    @ConfigurationProperties(prefix = "my")
    public ConfigBean configBean(){
        return new ConfigBean();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigApplication.class, args);
    }

}
