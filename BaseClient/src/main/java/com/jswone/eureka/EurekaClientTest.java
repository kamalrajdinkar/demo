package com.jswone.eureka;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientTest
{
    @Autowired
    private EurekaClient eurekaClient;
    @RequestMapping("/")
    public String home()
    {
        return "Hello World";
    }

    @GetMapping("/serverInfo")
    public String test()
    {
        return "calling service "+ eurekaClient.getApplicationInfoManager().getInfo().getInstanceId();
    }

}
