package com.xshalk.dubbo.spi.dubbo.ex2;

import org.apache.dubbo.common.URL;

/**
 * @author shalk
 * @since 19-7-17
 */
public class ThinkPad implements Computer {
    @Override
    public void test(URL url) {
        System.out.println("ThinkPad-test");
    }

    @Override
    public void test2(URL url) {
        System.out.println("ThinkPad-test2");
    }
}
