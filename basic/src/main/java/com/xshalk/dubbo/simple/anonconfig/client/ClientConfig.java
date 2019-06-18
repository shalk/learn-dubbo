package com.xshalk.dubbo.simple.anonconfig.client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiaokun
 * @since 19-6-18
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xshalk.dubbo.simple.anonconfig.client")
@PropertySource("classpath:/dubbo-consumer.properties")
public class ClientConfig {
}
