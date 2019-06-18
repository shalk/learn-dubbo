package com.xshalk.dubbo.simple.apiconfig;

import com.xshalk.dubbo.simple.DemoServiceImpl;
import com.xshalk.dubbo.simple.api.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author xiaokun
 * @since 19-6-18
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();

        ApplicationConfig appConfig = new ApplicationConfig();
        appConfig.setName("provider-api-1");
        appConfig.setQosEnable(false);

        serviceConfig.setApplication(appConfig);

        ProtocolConfig protoConfig = new ProtocolConfig();
        protoConfig.setPort(12345);

        serviceConfig.setProtocol(protoConfig);

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        serviceConfig.setRegistry(registryConfig);

        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(new DemoServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
