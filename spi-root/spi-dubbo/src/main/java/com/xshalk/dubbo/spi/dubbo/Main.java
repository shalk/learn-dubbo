package com.xshalk.dubbo.spi.dubbo;

import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shalk
 * @since 19-7-15
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dubbo SPI");
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("dubbo");
        System.out.println("protocol.getClass() = " + protocol.getClass());
        Protocol protocol1 = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        System.out.println("protocol1 = " + protocol1);
    }
}
