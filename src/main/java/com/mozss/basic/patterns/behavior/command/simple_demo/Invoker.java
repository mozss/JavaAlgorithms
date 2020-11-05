package com.mozss.basic.patterns.behavior.command.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:26
 */

public class Invoker {
    private final Command command;

    /*
     * 构造函数
     * */
    public Invoker(Command command) {
        this.command = command;
    }

    /*
     * 执行方法
     * */
    public void action() {
        command.execute();
    }
}


