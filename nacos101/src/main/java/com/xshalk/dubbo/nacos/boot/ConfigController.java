package com.xshalk.dubbo.nacos.boot;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaokun
 * @since 19-6-19
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${msg:init}", autoRefreshed = true)
    private String msg;

    @GetMapping("/msg")
    public String msg() {
        return msg;
    }
}
