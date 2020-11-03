package com.mozss.basic.patterns.behavior.observe.second_demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author mozss
 * @create 2019-10-28 15:00
 */

abstract public class Subject {
    //这个聚集保存了所有对观察者对象的引用
    private Vector observersVector = new Vector();

    /*
     * 调用这个方法登记一个新的观察者对象
     * */
    public void attach(Observer observer) {
        observersVector.addElement(observer);
        System.out.println("Attached an abserver");
    }

    /*
     * 调用这个方法删除一个已经登记过的观察者对象
     * */
    public void detach(Observer observer) {
        observersVector.removeElement(observer);
    }

    /*
     * 调用这个方法通知所有登记过的观察者对象
     * */
    public void notifyObservers() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()) {
            ((Observer) enumeration.nextElement()).update();
        }
    }

    /*
     * 通过这个方法给出观察者聚集的Enumeration对象
     * */
    private Enumeration observers() {
        return ((Vector) observersVector.clone()).elements();
    }


}
