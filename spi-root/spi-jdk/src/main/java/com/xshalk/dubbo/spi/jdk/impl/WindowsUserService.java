package com.xshalk.dubbo.spi.jdk.impl;

import com.xshalk.dubbo.spi.jdk.UserService;

/**
 * @author shalk
 * @since 19-7-12
 */
public class WindowsUserService implements UserService {

    @Override
    public String getName() {
        return "Windows PlatForm";
    }
}
