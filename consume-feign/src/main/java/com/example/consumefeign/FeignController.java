package com.example.consumefeign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

    @Autowired
    private MyFeignClient client;

    @RequestMapping("/hi")
    @ResponseBody
    public String say(){
        String say = client.say();
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
