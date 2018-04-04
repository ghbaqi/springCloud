package com.example.consumeribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumeController {

    @Autowired
    private ConsumeService service;

    @ResponseBody
    @RequestMapping("/say/{name}")
    public String say(@PathVariable String name) {
        String say = service.say(name);
        return say;
    }

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/hi")
    public String say() {
        String say = restTemplate.getForObject("http://SERVICE-PROVIDER/hi",String.class);
        return say;
    }

    @Value("${server.port}")
    String port;

    @ResponseBody
    @RequestMapping("/zuul")
    public String zuul() {
        return "zuul port = "+port;
    }


}
