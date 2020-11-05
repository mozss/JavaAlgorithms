package com.mozss.basic.patterns.structural.composite.safe;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author mozss
 * @create 2019-09-16 18:37
 */

public class Composite implements Component {
    private final Vector componentVector = new Vector();

    /*
     * 返回自己的实例
     * */
    @Override
    public Composite getComposite() {
        return this;
    }

    /*
     * 返回某个商业方法
     * */
    @Override
    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) (enumeration.nextElement())).sampleOperation();
        }
    }

    /*
     * 聚集管理方法，返回聚集的Enumeration对象
     * */
    private Enumeration components() {
        return componentVector.elements();
    }

    /*
     * 聚集管理方法，增加一个子构件
     * */
    public void add(Component component) {
        componentVector.addElement(component);
    }

    /*
     * 聚集管理方法，删除一个子构件
     * */
    public void remove(Component component) {
        componentVector.removeElement(component);
    }

}
