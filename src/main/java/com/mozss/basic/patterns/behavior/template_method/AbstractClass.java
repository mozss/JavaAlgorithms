package com.mozss.basic.patterns.behavior.template_method;

/**
 * @author mozss
 * @create 2019-09-24 21:22
 */

public abstract class AbstractClass {
    /*
     * 模板方法的声明和实现
     * */
    public void TemplateMethod() {
        //调用基本方法（由子类实现）
        doOperation1();
        //调用基本方法（由子类实现）
        doOperation2();
        //调用基本方法（已经实现）
        doOperation3();

    }

    /*
     * 基本方法的声明（由子类实现）
     * */
    protected abstract void doOperation1();

    /*
     * 基本方法的声明（由子类实现）
     * */
    protected abstract void doOperation2();

    /*
     * 基本方法（已经实现）
     * */
    protected final void doOperation3() {
        //do something
    }

}
