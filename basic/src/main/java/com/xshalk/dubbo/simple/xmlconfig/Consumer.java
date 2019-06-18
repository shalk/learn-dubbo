package com.xshalk.dubbo.simple.xmlconfig;

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
        DemoService demoService = (DemoService) context.getBean("demoService");
        for (int i = 0; i < 20; i++) {
            String hello = demoService.sayHello("world" + i);
            System.out.println(hello);
        }
    }
}
