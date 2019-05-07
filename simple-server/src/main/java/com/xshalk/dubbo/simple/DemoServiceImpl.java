package com.xshalk.dubbo.simple;

import com.xshalk.dubbo.simple.api.DemoService;

/**
 * @author xiaokun
 * @since 19-5-7
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
