package com.dyl.a00_reflectandgenerics;





/**
 *
 *  1、顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），然后在使用/调用时传入具体的类型（类型实参）
 *     简单得说就是调用的时候传入具体的数据对象
 *
 *  2、范型的本质是参数化类型（在不创建新的类型下，通过范型指定的不同类型来控制形参数的类型）
 *
 *  3、在范型的使用过程中，操作的数据类型被指定为一个参数，这个参数可以用在类、接口和方法中: 范型类、范型接口、范型方法
 *
 *
 *
 *
 * @param <T>
 */
// 1、范型类
public class NormGenericClass<T>  {
    private T data;

    public NormGenericClass() {
    }

    public NormGenericClass(T data) {
        this();
        this.data = data;
    }
}


