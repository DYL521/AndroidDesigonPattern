package com.example.a12_observable;

import java.util.Observable;

/**
 * @author DYL
 */
public class DevTechFrontier extends Observable {


    public void postNewPublication(String content){
        //标示状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
