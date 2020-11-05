package com.mozss.basic.patterns.behavior.command.tv_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:57
 */

public class ChannelCommand implements Command {
    private final Tv myTv;
    private int channel;

    public ChannelCommand(Tv tv, int channel) {
        myTv = tv;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        myTv.changeChannel(channel);
    }
}
