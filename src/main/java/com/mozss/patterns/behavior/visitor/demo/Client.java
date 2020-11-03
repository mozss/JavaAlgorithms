package com.mozss.patterns.behavior.visitor.demo;

/**
 * @author mozss
 * @create 2019-09-17 13:06
 */

public class Client {
    private static ObjectStructure aObjects;
    private static Visitor visitor;

    static public void main(String[] args) {
        //创建一个结构对象
        aObjects = new ObjectStructure();
        //给结构增加一个节点
        aObjects.add(new NodeA());
        //给结构增加一个节点
        aObjects.add(new NodeB());

        //创建一个新的访问者
        visitor = (Visitor) new VisitorA();
        //让访问者访问结构
        aObjects.action(visitor);
    }
}
