package com.example.a12_observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author DYL
 */
public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("hi, " + name + ",网站内容更新啦，内容： " + o);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
