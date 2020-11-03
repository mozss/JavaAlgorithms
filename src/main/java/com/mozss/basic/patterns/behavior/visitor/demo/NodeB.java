package com.mozss.basic.patterns.behavior.visitor.demo;

/**
 * @author mozss
 * @create 2019-09-17 11:54
 */

public class NodeB extends Node {
    /*
     * 接受操作
     * */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /*
     * NodeB 特有的方法
     * */
    public String operationB() {
        return "NodeB is visited";
    }
}
