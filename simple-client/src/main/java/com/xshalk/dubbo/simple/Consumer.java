package com.xshalk.dubbo.simple;

import com.xshalk.dubbo.simple.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaokun
 * @since 19-5-7
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
