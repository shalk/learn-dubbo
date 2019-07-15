package com.xshalk.dubbo.spi.jdk.impl;

import com.xshalk.dubbo.spi.jdk.UserService;

/**
 * @author shalk
 * @since 19-7-12
 */
public class LinuxUserService implements UserService {
    @Override
    public String getName() {
        return "Linux Platform";
    }
}
