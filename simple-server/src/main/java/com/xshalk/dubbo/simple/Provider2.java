package com.xshalk.dubbo.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xiaokun
 * @since 19-5-7
 */
public class Provider2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider2.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read();
    }
}
