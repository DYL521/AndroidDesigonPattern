package com.example.a21_decorator;

/**
 * @author DYL
 * <p>
 * 组件具体实现类：
 *      被装饰对象的具体实现
 */
public class ConcreateComponent extends Component {
    @Override
    public void operate() {

        System.out.println("ConcreateComponent.....");
    }
}
