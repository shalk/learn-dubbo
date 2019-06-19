package com.xshalk.dubbo.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaokun
 * @since 19-6-19
 */
@RestController
public class ConfigController {

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
}
