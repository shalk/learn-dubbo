package com.xshalk.dubbo.simple.anonconfig.server;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author shalk
 * @since 19-6-18
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.xshalk.dubbo.simple.anonconfig.server")
@PropertySource("classpath:/dubbo-provider.properties")
public class ServerConfig {

}
