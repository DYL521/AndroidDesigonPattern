package com.example.a001_reflectdome.service;

import com.example.a001_reflectdome.ICarService;

public class NIOImpl  implements ICarService {
    @Override
    public void make() {
        System.out.println("蔚来造车....");
    }
}
