package com.xshalk.dubbo.spi.dubbo;

import com.xshalk.dubbo.spi.dubbo.ex1.Car;
import com.xshalk.dubbo.spi.dubbo.ex2.Computer;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;

/**
 * @author shalk
 * @since 19-7-15
 */
public class Main {
    public static void main(String[] args) {
        carSPI();
        computerSPI();
    }


    public static void carSPI() {
        {
            Car car = ExtensionLoader.getExtensionLoader(Car.class).getDefaultExtension();
            URL url = new URL("p", "127.0.0.1", 123, "/path", new HashMap<>());
            System.out.println(car.getName());
        }
        {
            Car car = ExtensionLoader.getExtensionLoader(Car.class).getExtension("race");
            URL url = new URL("p", "127.0.0.1", 123, "/path", new HashMap<>());
            System.out.println(car.getPrice());
        }
    }


    private static void computerSPI() {
        Computer computer = ExtensionLoader.getExtensionLoader(Computer.class).getAdaptiveExtension();
        {
            HashMap<String, String> map = new HashMap<>();
            map.put("key1", "acer");
            URL url = new URL("p", "127.0.0.1", 123, "/path", map);
            computer.test(url);
        }
        {
            HashMap<String, String> map = new HashMap<>();
            map.put("key1", "ibm");
            URL url = new URL("p", "127.0.0.1", 123, "/path", map);
            computer.test(url);
        }
    }

}
