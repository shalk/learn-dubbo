package com.xshalk.dubbo.simple;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * @author xiaokun
 * @since 19-6-20
 */
public class Consumer {
    public static void main(String[] args) {
        ReferenceConfig<EchoService> config = new ReferenceConfig<>();

        ApplicationConfig appConfig = new ApplicationConfig();
        appConfig.setName("consumer-1");
        config.setApplication(appConfig);

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");
        config.setRegistry(registry);

        config.setInterface(EchoService.class);

        EchoService client = config.get();
        for (int i = 0 ; i < 10; i++) {
            System.out.println(client.echo("node" + i));
        }
    }
}
