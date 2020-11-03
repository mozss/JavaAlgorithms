package com.mozss.patterns.behavior.chain_of_responsibility.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 12:49
 */

public abstract class Handler {
    /*
     * 处理方法，调用此方法处理请求
     * */
    protected Handler successor;

    public abstract void handleRequest();

    /*
     * 赋值和取值方法
     * */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }
}
