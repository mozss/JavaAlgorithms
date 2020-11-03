package com.mozss.patterns.structural.decorator.simple_demo;

/**
 * @author mozss
 * @create 2019-10-29 11:53
 */

public class Decorator implements Component {
    private Component component;

    /*
     * 构造函数
     * */
    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    /*
     * 商业方法：委派给构件
     * */
    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }

}
