package com.mozss.basic.patterns.structural.proxy;

/**
 * @author mozss
 * @create 2019-09-16 14:20
 */

public class Client {
    public static void main(String[] args) {
        //调用
        Subject subject = new ProxySubject();
        subject.request();
    }
}
