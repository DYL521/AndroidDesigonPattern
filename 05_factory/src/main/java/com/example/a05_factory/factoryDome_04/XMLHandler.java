package com.example.a05_factory.factoryDome_04;

/**
 * @author DYL
 */
public class XMLHandler extends IOhandler {
    @Override
    public void add(String id, String name) {
        System.out.println("add: " + id + ",name: " + name);
    }

    @Override
    public void remove(String id) {
        System.out.println("remove: " + id);
    }

    @Override
    public void update(String id, String name) {
        System.out.println("update: " + id + ",name: " + name);
    }

    @Override
    public String query(String id) {
        System.out.println("query: " + id);
        return id;
    }
}
