package com.xshalk.dubbo.nacos.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shalk
 * @since 19-6-19
 */
@RestController
public class MyContoller {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
