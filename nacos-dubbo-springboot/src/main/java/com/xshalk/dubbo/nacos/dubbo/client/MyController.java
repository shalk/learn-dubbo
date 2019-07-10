package com.xshalk.dubbo.nacos.dubbo.client;

import com.xshalk.dubbo.nacos.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shalk
 * @since 19-6-18
 */
@RestController("test")
public class MyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);

    @Reference
    DemoService demoService;

    @GetMapping("/test/{msg}")
    public String test(@PathVariable("msg") String msg) {
        try {
            return demoService.sayHello(msg);
        } catch (Exception e) {
            LOGGER.error("err:", e);
            return "fail";
        }
    }

}
