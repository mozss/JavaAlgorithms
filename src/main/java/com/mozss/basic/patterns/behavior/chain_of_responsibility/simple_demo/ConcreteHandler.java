package com.mozss.basic.patterns.behavior.chain_of_responsibility.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 12:53
 */

public class ConcreteHandler extends Handler {
    /*
     * 处理方法，调用此方法处理请求
     * */
    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("The request is passed to + getSuccessor");
            getSuccessor().handleRequest();
        } else {
            System.out.println("The request is handled here");
        }

    }
}
