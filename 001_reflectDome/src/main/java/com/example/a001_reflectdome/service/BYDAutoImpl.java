package com.example.a001_reflectdome.service;

import com.example.a001_reflectdome.ICarService;

public class BYDAutoImpl implements ICarService {
    @Override
    public void make() {
        System.out.println("比亚迪生产汽车。。。");
    }
}
