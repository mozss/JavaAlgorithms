package com.mozss.basic.patterns.structural.proxy;

/**
 * @author mozss
 * @create 2019-09-16 14:03
 */

public class RealSubject extends Subject {

    public RealSubject() {

    }

    /*
     * 实现请求方法
     * */
    @Override
    public void request() {
        System.out.println("From real subject.");
    }


}
