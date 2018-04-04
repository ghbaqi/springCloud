package com.example.consumeribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeService {

    @Autowired
    private RestTemplate restTemplate;

    public String say(String name) {
        System.out.println("consume say");
        return restTemplate.getForObject("http://SERVICE-PROVIDER/say/"+name,String.class);
    }
}
