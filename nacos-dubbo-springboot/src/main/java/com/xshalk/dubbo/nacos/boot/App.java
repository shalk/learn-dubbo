package com.xshalk.dubbo.nacos.boot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shalk
 * @since 19-6-19
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
