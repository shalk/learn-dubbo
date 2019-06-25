package com.xshalk.dubbo.client;

import com.xshalk.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaokun
 * @since 19-6-25
 */
@RestController
public class ClientController {


    @Reference
    public UserService userService;

    @GetMapping("/test")
    public String test() {
        return "Client Work!";
    }

    @GetMapping("/hi/{msg}")
    public String hi(@PathVariable("msg") String msg) {
        return userService.sayHi(msg);
    }
}
