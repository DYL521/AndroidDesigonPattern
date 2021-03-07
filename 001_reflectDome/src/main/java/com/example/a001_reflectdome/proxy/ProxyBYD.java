package com.example.a001_reflectdome.proxy;

import com.example.a001_reflectdome.ICarService;

public class ProxyBYD  implements ICarService {

    ICarService iCarService;

    public ICarService getiCarService() {
        return iCarService;
    }

    public void setiCarService(ICarService iCarService) {
        this.iCarService = iCarService;
    }

    @Override
    public void make() {
        System.out.println("ProxyBYD 比亚迪生产汽车。。。");

    }
}
