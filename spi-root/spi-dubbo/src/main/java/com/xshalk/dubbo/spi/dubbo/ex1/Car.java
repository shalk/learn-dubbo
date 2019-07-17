package com.xshalk.dubbo.spi.dubbo.ex1;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author shalk
 * @since 19-7-16
 */

@SPI("truck")
public interface Car {

    String getName();

    String getPrice();

}
