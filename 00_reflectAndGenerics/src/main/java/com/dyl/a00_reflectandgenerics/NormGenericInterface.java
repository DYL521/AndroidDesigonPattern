package com.dyl.a00_reflectandgenerics;


// 2、范型接口: 定义方法==范型类
public interface NormGenericInterface<T> {

    public T next();
}

// 实现范型接口的方法：
// 1、为传入范型实参
/**
 *  public class ImplGenerator<T> implements  Generic<T>{
 *      private T data;
 *  }
 *
 *  在实例化对象的时候，需要指定数据类型：
 *  ImplGenerator<String> impl = new XXXXX
 */

//2、传入范型实参：
/**
 *  public class ImplGenerator implements  Generic<String>{
 *      private T data;
 *  }
 *  这样的情况下，跟普通的类都没啥区别
 */
