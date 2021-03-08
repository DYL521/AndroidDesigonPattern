package com.example.a05_factory.factoryDome_04;

/**
 * @author DYL
 */
public abstract class IOhandler {

    /**
     * 添加人员
     *
     * @param id
     * @param name
     */
    public abstract void add(String id, String name);

    /**
     * 移除人员
     *
     * @param id
     */
    public abstract void remove(String id);


    /**
     * 更新人员信息
     *
     * @param id
     * @param name
     */
    public abstract void update(String id, String name);


    /**
     * 查询人员名字
     *
     * @param id
     */
    public abstract String query(String id);
}
