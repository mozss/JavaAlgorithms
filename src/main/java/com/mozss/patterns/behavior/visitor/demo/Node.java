package com.mozss.patterns.behavior.visitor.demo;

/**
 * @author mozss
 * @create 2019-09-17 11:04
 */

abstract public class Node {
    /*
     * 接受操作
     * */
    public abstract void accept(Visitor visitor);
}
