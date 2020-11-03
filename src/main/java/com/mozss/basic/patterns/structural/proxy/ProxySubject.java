package com.mozss.basic.patterns.structural.proxy;

/**
 * @author mozss
 * @create 2019-09-16 14:06
 */

public class ProxySubject extends Subject {
    private RealSubject realSubject;

    public ProxySubject() {

    }

    /*
     * 实现请求
     * */
    @Override
    public void request() {
        preRequest();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        postRequest();
    }

    /*
     * 请求前的操作
     * */
    private void preRequest() {
        //something you want to do before requesting
    }

    /*
     * 请求后的操作
     * */
    private void postRequest() {
        //something you want to do after requesting
    }


}
