package com.xshalk.dubbo.nacos.dubbo.server;

import com.xshalk.dubbo.nacos.dubbo.api.DemoService;
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
