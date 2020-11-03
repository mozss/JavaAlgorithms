package com.mozss.basic.patterns.behavior.observe.second_demo;

/**
 * @author mozss
 * @create 2019-10-28 15:10
 */

public class Client {
    private static ConcreteSubject subject;
    private static Observer observer;

    public static void main(String[] args) {
        //创建主题对象
        subject = new ConcreteSubject();
        //创建观察者对象
        observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }
}
