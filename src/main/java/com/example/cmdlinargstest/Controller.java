package com.example.cmdlinargstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MockDatabaseConnector connector;

    @Value("${my.test.string}")
    private String myString;

    @GetMapping("/")
    public String canIPrintAP(){
        System.out.println(connector.getDatabaseUrl());
        System.out.println(connector.getUser());
        System.out.println(connector.getPassword());
        return myString;
    }


}
