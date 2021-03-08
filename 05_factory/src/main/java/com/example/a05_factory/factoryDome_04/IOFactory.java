package com.example.a05_factory.factoryDome_04;

/**
 * @author DYL
 */
public class IOFactory {


    /**
     * 处理IO处理者
     * @param clz IOhandler 类型的类型
     * @param <T>
     * @return
     */
    public static <T extends IOhandler> T getIOHandler(Class<T> clz) {
        IOhandler handler = null;
        try {
            handler = (IOhandler) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) handler;
    }

}
