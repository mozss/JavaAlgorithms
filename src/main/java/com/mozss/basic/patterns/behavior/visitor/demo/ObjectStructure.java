package com.mozss.basic.patterns.behavior.visitor.demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author mozss
 * @create 2019-09-17 13:01
 */

public class ObjectStructure {
    private final Vector nodes;
    private Node node;

    /*
     * 构造子
     * */
    public ObjectStructure() {
        nodes = new Vector();
    }

    /*
     * 执行访问操作
     * */
    public void action(Visitor visitor) {
        for (Enumeration e = nodes.elements();
             e.hasMoreElements(); ) {
            node = (Node) e.nextElement();
            node.accept(visitor);
        }
    }

    /*
     * 增加一个新的元素
     * */
    public void add(Node node) {
        nodes.addElement(node);
    }


}
