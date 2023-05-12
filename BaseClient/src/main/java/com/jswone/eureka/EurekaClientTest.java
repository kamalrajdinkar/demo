package com.jswone.eureka;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
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
        log.info("/serverInfo hit for demo application");
        return "calling service "+ eurekaClient.getApplicationInfoManager().getInfo().getInstanceId();
    }

}
