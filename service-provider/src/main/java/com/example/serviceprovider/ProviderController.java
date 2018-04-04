package com.example.serviceprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {

    @Value("${server.port}")
    private String port;


    //  restTemplate.getForObject("http://SERVICE-PROVIDER/say/"+name,String.class);
    @RequestMapping("/say/{name}")
    @ResponseBody
    public String say(@PathVariable String name) {
        System.out.println("provider say");
        System.out.println("port = "+port);
        return "name = "+name+", port = "+port;
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        System.out.println("hi");

        return "i say hi port = "+port;
    }
}
