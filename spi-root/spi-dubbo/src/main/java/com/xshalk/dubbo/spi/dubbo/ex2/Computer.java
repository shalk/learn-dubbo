package com.xshalk.dubbo.spi.dubbo.ex2;

/**
 * @author shalk
 * @since 19-7-17
 */

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Computer {

    @Adaptive("key1")
    public void test(URL url);

    public void test2(URL url);
}
