package com.xshalk.dubbo.server;

import com.xshalk.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author xiaokun
 * @since 19-6-25
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi(String name) {
        return "hi " + name;
    }
}
