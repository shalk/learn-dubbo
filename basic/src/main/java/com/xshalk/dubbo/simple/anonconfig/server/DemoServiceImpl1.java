package com.xshalk.dubbo.simple.anonconfig.server;

import com.xshalk.dubbo.simple.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author shalk
 * @since 19-6-18
 */
@Service
public class DemoServiceImpl1 implements DemoService {
    @Override
    public String sayHello(String name) {
        return "name: " + name;
    }
}
