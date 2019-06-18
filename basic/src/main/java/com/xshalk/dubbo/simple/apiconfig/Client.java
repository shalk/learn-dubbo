package com.xshalk.dubbo.simple.apiconfig;

import com.xshalk.dubbo.simple.api.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;


/**
 * @author xiaokun
 * @since 19-6-18
 */
public class Client {
    public static void main(String[] args) {
        ReferenceConfig<DemoService> config = new ReferenceConfig<DemoService>();
        config.setInterface(DemoService.class);

        ApplicationConfig appConfig = new ApplicationConfig();
        appConfig.setName("clientConsumer1");
        appConfig.setQosEnable(false);

        config.setApplication(appConfig);

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        config.setRegistry(registryConfig);

        DemoService service = config.get();
        String res = service.sayHello("nice");
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
        System.out.println("res = " + res);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
