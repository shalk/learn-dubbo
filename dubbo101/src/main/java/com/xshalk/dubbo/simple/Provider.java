package com.xshalk.dubbo.simple;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author shalk
 * @since 19-6-20
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ServiceConfig<EchoService> config = new ServiceConfig<>();

        ApplicationConfig appConfig = new ApplicationConfig();
        appConfig.setName("provider-1");
        config.setApplication(appConfig);

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        config.setRegistry(registryConfig);

        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(12345);
        protocolConfig.setName("dubbo");
        config.setProtocol(protocolConfig);


        config.setInterface(EchoService.class);
        config.setRef(new EchoServiceImpl());
        config.export();
        System.in.read();
    }
}
