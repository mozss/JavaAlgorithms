package com.mozss.patterns.structural.flyweight.dancun_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-10-29 17:45
 */

public class FlyweightFactory {
    private HashMap files = new HashMap();
    private Flyweight InkFlyweight;

    /*
     * 默认构造函数
     * */
    public FlyweightFactory() {
    }
    /*
     * 构造函数，内蕴状态作为参数传入
     * */

    public Flyweight FlyweightFactory(Character state) {
        if (files.containsKey(state)) {
            return (Flyweight) files.get(state);
        } else {
            Flyweight fly = new ConcreteFlyweight(state);
            files.put(state, fly);
            return fly;
        }
    }

    /*
     * 辅助方法
     * */
    public void checkFlyweight() {
        Flyweight fly;
        int i = 0;
        System.out.println("==========checkFlyweight()==========");
        for (Iterator it = files.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item" + (++i) + ":" + e.getKey());
        }
        System.out.println("==========checkFlyweight()==========");
    }


}
