package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yz on 17/8/23.
 */


@RequestMapping("/test")
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @GetMapping
    public String test(@RequestParam String name){
        return "hi "+name+" i am at "+port;
    }
}
