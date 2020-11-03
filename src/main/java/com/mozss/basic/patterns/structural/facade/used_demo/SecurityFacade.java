package com.mozss.basic.patterns.structural.facade.used_demo;

/**
 * @author mozss
 * @create 2019-10-29 16:51
 */

public class SecurityFacade {
    private Camera camera1, camera2;
    private Light light1, light2, light3;
    private Sensor sensor;
    private Alarm alarm;

    public void active() {
        camera1.turnOn();
        camera2.turnOn();
        light1.turnOn();
        light2.turnOn();
        light3.turnOn();
        sensor.active();
        alarm.activate();
    }

    public void deactive() {
        camera1.turnOff();
        camera2.turnOff();
        light1.turnOff();
        light2.turnOff();
        light3.turnOff();
        sensor.deactivate();
        alarm.deactivate();
    }
}
