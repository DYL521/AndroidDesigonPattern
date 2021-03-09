package com.example.a21_decorator.demo;

/**
 * @author DYL
 *
 *  昂贵的衣服
 */
public class ExpensiveCloth extends PersonCloth {


    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt() {
        System.out.println("穿短袖...");
    }

    private void dressJean() {
        System.out.println("穿牛仔裤...");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressJean();
        dressShirt();
    }
}
