package com.mozss.patterns.behavior.command.tv_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:48
 */

public class Tv {
    private int currentChannel = 0;

    /*
     * 行动方法
     * */
    public void turnOn() {
        System.out.println("The television is on");
    }

    /*
     * 行动方法
     * */
    public void trunOff() {
        System.out.println("The televion is off");
    }

    /*
     * 行动方法
     * */
    public void changeChannel(int channel) {
        currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}
