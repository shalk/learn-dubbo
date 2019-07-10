package com.xshalk.dubbo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shalk
 * @since 19-6-25
 */
@RestController
public class ServerController {

    @GetMapping("/test")
    public String  test() {
        return "Server Work!";
    }
}
