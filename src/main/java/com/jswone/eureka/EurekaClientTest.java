package com.jswone.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientTest
{
    @RequestMapping("/")
    public String home()
    {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientTest.class,args);
    }
}
