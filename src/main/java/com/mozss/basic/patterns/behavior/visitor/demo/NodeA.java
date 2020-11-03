package com.mozss.basic.patterns.behavior.visitor.demo;

/**
 * @author mozss
 * @create 2019-09-17 11:52
 */

public class NodeA extends Node {
    /*
     * 接受操作
     * */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /*
     * NodeA特有的方法
     * */
    public String operationA() {
        return "NodeA is visited";
    }
}
