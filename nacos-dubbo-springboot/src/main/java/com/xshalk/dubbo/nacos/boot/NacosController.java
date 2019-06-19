package com.xshalk.dubbo.nacos.boot;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaokun
 * @since 19-6-19
 */
@RestController
public class NacosController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @NacosValue(value = "${msg:init}", autoRefreshed = true)
    private String msg;

    @GetMapping("/cache")
    public boolean isUseLocalCache() {
        return useLocalCache;
    }

    @GetMapping("/msg")
    public String msg() {
        return msg;
    }

    @NacosInjected
    ConfigService configService;

    @GetMapping("/query")
    public String query(String key) throws NacosException {
        String config = configService.getConfig("example", "DEFAULT_GROUP", 5000);
        return config;
    }
}
