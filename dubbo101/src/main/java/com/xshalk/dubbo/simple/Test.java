package com.xshalk.dubbo.simple;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
//        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
//        System.out.println("protocol1 = " + protocol.getClass());
//
//        Protocol protocol1 = ExtensionLoader.getExtensionLoader(Protocol.class).getDefaultExtension();
//        System.out.println("protocol1 = " + protocol1.getClass());
        System.out.println("test");
        Class.forName("com.xshalk.dubbo.simple.Provider");
    }
}