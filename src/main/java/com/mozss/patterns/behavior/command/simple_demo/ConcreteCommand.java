package com.mozss.patterns.behavior.command.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:31
 */

public class ConcreteCommand implements Command {
    private Receiver receiver;

    /*
     * 构造函数
     * */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        receiver.action();
    }
}
