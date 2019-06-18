package com.xshalk.dubbo.zk;

import com.xshalk.dubbo.simple.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaokun
 * @since 19-5-8
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("bean1");
        String hello = demoService.sayHello("zookeeper" );
        System.out.println(hello);

    }
}
