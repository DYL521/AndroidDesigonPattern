package com.example.a21_decorator.template;

/**
 * @author DYL
 * 抽象装饰者：
 *      装饰器，就是装饰我们的组件对象；必须持有被装饰对象的引用
 */
public abstract class Decorator extends Component {

    // 持有一个Component对象的引用
    private Component component;

    /**
     * 必要的构造方法，需要一个Component的引用
     *
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void operate() {
        component.operate();
    }
}
