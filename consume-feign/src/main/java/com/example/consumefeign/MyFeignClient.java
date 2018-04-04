package com.example.consumefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE-PROVIDER")
public interface MyFeignClient {

    @GetMapping("/hi")

    String say();
}
