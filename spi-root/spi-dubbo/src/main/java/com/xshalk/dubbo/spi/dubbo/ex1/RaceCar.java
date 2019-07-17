package com.xshalk.dubbo.spi.dubbo.ex1;

import org.apache.dubbo.common.URL;

/**
 * @author shalk
 * @since 19-7-16
 */
public class RaceCar implements Car {

    @Override
    public String getName() {
        return "Race Car";
    }

    @Override
    public String getPrice() {
        return "1000 race car";
    }
}
