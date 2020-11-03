package com.mozss.basic.patterns.behavior.command.tv_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:48
 */

public class OnCommand implements Command {
    private Tv myTV;

    /*
     * 构造函数
     * */
    public OnCommand(Tv tv) {
        myTV = tv;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        myTV.turnOn();
    }
}
