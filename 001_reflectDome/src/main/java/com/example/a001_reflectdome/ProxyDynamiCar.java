package com.example.a001_reflectdome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * <p>
 * https://blog.csdn.net/yaomingyang/article/details/80981004
 */

/**
 *
 * 1、InvocationHandler：
 *       每个动态代理类的调用处理呈现必须实现InvocationHandler
 *       当我们通过动态代理调用一个方法的时候，这个方法就会被转发到实现InvocationHandler接口类的invoke方法来调用
 *
 */
public class ProxyDynamiCar implements InvocationHandler {

    private Object carService;

    public Object getCarService() {
        return carService;
    }

    public void setCarService(Object carService) {
        this.carService = carService;
    }

    /**
     * 2、Proxy：
     *      Proxy类就是用来创建一个代理对象的类，它提供了很多方法，但是我们最常用的是newProxyInstance方法
     * @return
     */
    public Object getDynamicProxyInstance() {
        /**
         *
         */
        return Proxy.newProxyInstance(
                //classloader：代理类加载对象
                carService.getClass().getClassLoader(),
                // Interfaces： 代理类具体要实现怎么样的所有方法
                carService.getClass().getInterfaces(),
                //InvocationHandler：动态代理对象调用方法的时候关联到哪个InvocationHandler的invoke执行
                this
        );
    }

    /**
     *
     * @param proxy ：代理的真实对象
     * @param method： 代理对象的方法Method对象
     * @param objects：指的是代理对象方法传递的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {

        //执行真实的方法之前我们可以加自己的功能
        System.out.println("before invoke。。。");
        Object o = method.invoke(carService, objects);
        System.out.println("after invoke。。。");
        return o;
    }
}
