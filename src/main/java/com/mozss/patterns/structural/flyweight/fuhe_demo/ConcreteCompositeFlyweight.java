package com.mozss.patterns.structural.flyweight.fuhe_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-10-29 20:42
 */

public class ConcreteCompositeFlyweight extends Flyweight {
    private HashMap flies = new HashMap(10);
    private Flyweight flyweight;
    /*
     * 默认构造函数
     * */

    public ConcreteCompositeFlyweight() {
    }

    /*
     * 添加一个新的单纯享元对象到聚集中
     * */
    public void add(Character key, Flyweight fly) {
        flies.put(key, fly);
    }

    /*
     * 外蕴状态作为参量传入方法中
     * */
    @Override
    public void operation(String extrinsicState) {
        Flyweight fly = null;
        for (Iterator it = flies.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry e = (Map.Entry) it.next();
            fly = (Flyweight) e.getKey();
            fly.operation(extrinsicState);
        }
    }


}
