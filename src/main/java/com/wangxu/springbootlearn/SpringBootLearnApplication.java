package com.wangxu.springbootlearn;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);
    }

    /**
     * 打印启动前注入了哪些bean
     * @param ctx
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }
}
