package com.neuqer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yz on 17/8/23.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;



    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
