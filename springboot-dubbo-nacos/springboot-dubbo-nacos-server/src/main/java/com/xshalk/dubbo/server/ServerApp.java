package com.xshalk.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaokun
 * @since 19-6-24
 */
@SpringBootApplication
public class ServerApp {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ServerApp.class, args);
    }
}
