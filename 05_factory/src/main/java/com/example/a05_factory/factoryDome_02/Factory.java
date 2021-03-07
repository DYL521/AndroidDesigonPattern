package com.example.a05_factory.factoryDome_02;

import com.example.a05_factory.factoryDome_01.Product;

/**
 * 工厂类
 */
public abstract class Factory {
    /**
     *
     * @param clz 产品对象类型
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProdct(Class<T> clz);
}
