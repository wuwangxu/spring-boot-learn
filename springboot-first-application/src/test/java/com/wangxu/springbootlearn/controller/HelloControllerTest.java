package com.wangxu.springbootlearn.controller;

import com.wangxu.springbootfirstapplication.SpringbootFirstApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author WangXu
 * @version V1.0
 * @Package com.wangxu.springbootlearn.controller
 * @Description: TODO (用一句话描述该文件做什么)
 * @date 2019/2/28 13:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootFirstApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

@Before
    public void setUp() throws MalformedURLException {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello(){
        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);

        System.out.println(response.getBody());
        Assert.assertEquals(response.getBody(),"Greetings from Spring Boot!");
    }
}
