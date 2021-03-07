package com.example.a001_reflectdome.proxy;

import com.example.a001_reflectdome.ICarService;

public class ProxyNIO  implements ICarService {

    private ICarService iCarService;

    public ICarService getiCarService() {
        return iCarService;
    }

    public void setiCarService(ICarService iCarService) {
        this.iCarService = iCarService;
    }

    @Override
    public void make() {
        System.out.println("ProxyNIO 蔚来生产汽车。。。");
    }
}
