package com.jswone;

import com.jswone.base.bean.ExternalProperties;
import com.jswone.base.transport.service.ITransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testingclient")
public class ClientTest {

    @Autowired
    ITransportService transportService;

    @Value("${app.kamal:custom}")
    private String kamal;


    @GetMapping("/config")
    public String config()
    {
        return kamal;
    }
    @GetMapping("/callbase")
    public ResponseEntity<Object> getconfig()
    {
        return transportService.callApi("http://demo/serverInfo",null,"GET",String.class);
    }
}
