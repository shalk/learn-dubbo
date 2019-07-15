package com.xshalk.dubbo.spi.jdk;

import java.util.ServiceLoader;

/**
 * @author shalk
 * @since 19-7-12
 */
public class Main {


    public static void main(String[] args) {

        ServiceLoader<UserService> loaders = ServiceLoader.load(UserService.class);
        loaders.iterator().forEachRemaining(u -> System.out.println(u.getName()));
        for (UserService loader : loaders) {
            System.out.println(loader.getName());
        }

    }
}
