package com.xshalk.dubbo.simple;

/**
 * @author shalk
 * @since 19-6-20
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "hello " + msg;
    }
}
