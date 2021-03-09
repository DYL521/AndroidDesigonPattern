package com.example.a21_decorator.demo;

public class main {

    public static void main(String[] args) {

        //1、被装饰类的对象
        Person person = new Boy();

        //2、装饰对象
        PersonCloth personCloth = new CheapCloth(person);
        personCloth.dressed();

        PersonCloth personCloth1 = new ExpensiveCloth(person);
        personCloth1.dressed();


    }
}
