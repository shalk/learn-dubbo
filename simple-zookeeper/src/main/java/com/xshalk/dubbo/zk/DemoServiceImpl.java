package com.xshalk.dubbo.zk;

import com.xshalk.dubbo.simple.api.DemoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author shalk
 * @since 19-5-7
 */
public class DemoServiceImpl implements DemoService {
    public static Log LOGGER = LogFactory.getLog(DemoServiceImpl.class);

    public String sayHello(String name) {
        LOGGER.info("say hello" + name);
        return "hello " + name;
    }
}
