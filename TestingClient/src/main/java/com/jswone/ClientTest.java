package com.jswone;

import com.jswone.base.transport.service.ITransportService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
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
        log.info("Calling baseClient");
        return transportService.callApi("http://demo/serverInfo",null,"GET",String.class);
    }

    @GetMapping ("/callbasetrace")
    public ResponseEntity<Object> getconfigtrace()
    {
        log.info("for trace");
        return transportService.callApi("http://demo/serverInfo",null,"GET",String.class,MDC.get("traceId"));
    }

//    @GetMapping("callthroghjswbase")
//    public ResponseEntity<Object> getconfig2()
//    {
//        log.info("Calling through jswone base");
////        return transportService.callApi()
//    }
}
