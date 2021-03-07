package com.example.a001_reflectdome;

import com.example.a001_reflectdome.proxy.ProxyBYD;
import com.example.a001_reflectdome.proxy.ProxyNIO;
import com.example.a001_reflectdome.service.BYDAutoImpl;
import com.example.a001_reflectdome.service.NIOImpl;
import com.example.a001_reflectdome.utils.ProxyUtil;

public class proxyDomeClient {


    public static void main(String[] args) {

        //1、直接使用
        ICarService carService = new BYDAutoImpl();
        carService.make();

        ICarService carService3 = new NIOImpl();
        carService3.make();
        System.out.println("===============：直接使用...");

        //2、静态代理
        ICarService carService2 = new NIOImpl();
        ProxyNIO proxyNIO = new ProxyNIO();
        proxyNIO.setiCarService(carService2);
        proxyNIO.make();
        System.out.println("===============：静态代理...");

        //2、动态代理
        ProxyDynamiCar proxyDynamicCar = new ProxyDynamiCar();
        ICarService carService1 = new NIOImpl();
        proxyDynamicCar.setCarService(carService1);
        ICarService orderService1 = (ICarService) proxyDynamicCar.getDynamicProxyInstance();
        orderService1.make();
        System.out.println("===============：动态代理...");

        // 生成动态代理生成的class文件
        ProxyUtil.generateClassFile(proxyDynamicCar.getClass(), orderService1.getClass().getSimpleName());


    }

}
