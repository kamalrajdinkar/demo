package com.jswone.json;

import com.jswone.base.transport.service.ITransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jswone.entity.*;

@RestController
public class Test{

    @Value("${kamal:huhu}")
    private String data;
    @Autowired
    private ITransportService iTransportService;

    @GetMapping("/config")
    public String config()
    {
        return data;
    }


    @GetMapping("/get")
    public Joke test()
    {
        System.out.println("Get Request");
        ResponseEntity<Object> obj=iTransportService.callApi("https://official-joke-api.appspot.com/random_joke",null, "GET", Joke.class);
        Joke joke= (Joke) obj.getBody();
        return joke;
    }
    @GetMapping("/notfound")
    public Object notFound()
    {
        ResponseEntity<Object> obj=iTransportService.callApi("https://reqres.in/api/users/23",null,"POST", Object.class);
        return obj;
    }


    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public EmployeeRes postRequest(@RequestBody EmployeeReq employeereq)
    {
        System.out.println("Post Request"+employeereq.toString());

        ResponseEntity<Object> obj=iTransportService.callApi("https://reqres.in/api/users",employeereq,"POST",EmployeeRes.class);
        EmployeeRes employeeRes=(EmployeeRes) obj.getBody();
        return employeeRes;
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("processIdent"));
    }
}
