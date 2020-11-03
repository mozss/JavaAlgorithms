package com.mozss.basic.patterns.structural.facade.used_demo;

/**
 * @author mozss
 * @create 2019-10-29 16:42
 */

public class Sensor {
    /*
     * 启动感应器
     * */
    public void active() {
        System.out.println("Activating the sensor");
    }

    /*
     * 关闭感应器
     * */
    public void deactivate() {
        System.out.println("Deactivating the sensor");
    }

    /*
     * 触发感应器
     * */
    public void trigger() {
        System.out.println("The sensor has been triggered");
    }

}
