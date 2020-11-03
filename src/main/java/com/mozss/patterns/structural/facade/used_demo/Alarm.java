package com.mozss.patterns.structural.facade.used_demo;

/**
 * @author mozss
 * @create 2019-10-29 16:45
 */

public class Alarm {
    /*
     * 启动报警器
     * */
    public void activate() {
        System.out.println("Activating the alarm");
    }

    /*
     * 关闭报警器
     * */
    public void deactivate() {
        System.out.println("Deactivating the alarm");
    }

    /*
     * 拉响报警器
     * */
    public void ring() {
        System.out.println("Ringing the alarm");
    }

    /*
     * 停掉警报器
     * */
    public void stopRing() {
        System.out.println("Stop the alarm");
    }
}

