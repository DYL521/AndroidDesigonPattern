package com.example.a21_decorator.demo;

/**
 * @author DYL
 *
 *  便宜的衣服
 */
public class CheapCloth extends PersonCloth {


    public CheapCloth(Person mPerson) {
        super(mPerson);
    }



    private void dressShorts() {
        System.out.println("穿短裤...");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
