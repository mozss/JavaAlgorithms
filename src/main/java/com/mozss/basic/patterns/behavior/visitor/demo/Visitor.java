package com.mozss.basic.patterns.behavior.visitor.demo;

/**
 * @author mozss
 * @create 2019-09-17 10:54
 */

public interface Visitor {
    /*
     * 对应于Node A的访问操作
     * */
    void visit(NodeA node);

    /*
     * 对应于Node B的访问操作
     * */
    void visit(NodeB node);


}
