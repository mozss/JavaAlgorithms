package com.mozss.basic.patterns.structural.bridge.simple_demo;

/**
 * @author mozss
 * @create 2019-10-29 9:29
 */

public class Abstraction {
    protected Implementor imp;

    /*
     * 某个商业方法
     * */
    public void operation() {
        imp.operationImp();
    }
}
