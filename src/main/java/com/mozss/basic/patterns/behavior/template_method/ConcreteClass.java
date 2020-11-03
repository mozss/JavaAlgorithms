package com.mozss.basic.patterns.behavior.template_method;

/**
 * @author mozss
 * @create 2019-09-24 21:30
 */

public class ConcreteClass extends AbstractClass {
    /*
     * 基本方法1的实现
     * */
    @Override
    protected void doOperation1() {
        System.out.println("doOperation1()方法的实现过程");
    }

    /*
     * 基本方法2的实现
     * */
    @Override
    protected void doOperation2() {
        //向下面这样的调用不应当发生
        //doOperation3();
        System.out.println("doOperation2()方法的实现过程");
    }
}
