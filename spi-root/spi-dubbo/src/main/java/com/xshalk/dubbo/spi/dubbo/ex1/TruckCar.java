package com.xshalk.dubbo.spi.dubbo.ex1;

import org.apache.dubbo.common.URL;

/**
 * @author shalk
 * @since 19-7-16
 */
public class TruckCar implements Car {

    @Override
    public String getName( ) {
        return "Truck";
    }

    @Override
    public String getPrice( ) {
        return "$100 truck";
    }
}
