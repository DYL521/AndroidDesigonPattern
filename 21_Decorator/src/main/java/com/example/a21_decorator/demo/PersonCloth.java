package com.example.a21_decorator.demo;

/**
 * @author DYL
 */
public class PersonCloth extends Person {

    //保持一个Person类的引用
    protected Person mPerson;

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        //调用Person的方法
        mPerson.dressed();
    }
}
