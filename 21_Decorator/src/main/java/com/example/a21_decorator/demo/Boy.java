package com.example.a21_decorator.demo;


/**
 * @author DYL
 *   被装饰对象的具体实现
 */
public class Boy  extends Person{
    @Override
    public void dressed() {
        System.out.println("小男孩 穿起了，小裙子，哈哈。。。");
    }
}
