package com.mozss.basic.patterns.behavior.command.tv_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:55
 */

public class OffCommand implements Command {
    private final Tv myTv;

    public OffCommand(Tv tv) {
        myTv = tv;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        myTv.trunOff();
    }
}
