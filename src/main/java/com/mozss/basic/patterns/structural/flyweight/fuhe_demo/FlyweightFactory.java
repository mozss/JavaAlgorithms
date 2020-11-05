package com.mozss.basic.patterns.structural.flyweight.fuhe_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-10-29 20:48
 */

public class FlyweightFactory {
    private final HashMap flies = new HashMap();

    /*
     * 默认构造函数
     * */
    public FlyweightFactory() {
    }

    /*
     * 复合享元工厂方法，所需状态以参量形式传入
     * 这个参量恰好可以使用String类型
     * */
    public Flyweight factory(String compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        int length = compositeState.length();
        Character state = null;
        for (int i = 0; i < length; i++) {
            state = new Character(compositeState.charAt(i));
            System.out.println("factory(" + state + ")");
            compositeFly.add(state, this.factory(state));
        }
        return compositeFly;
    }

    /*
     * 单纯享元工厂方法，所需状态以参量形式传入
     * */
    public Flyweight factory(Character state) {
        //检查具有此状态的享元是否已经存在
        if (flies.containsKey(state)) {
            //具有此状态的享元已经存在，因此直接将它返还
            return (Flyweight) flies.get(state);
        } else {
            //具有此状态的享元不存在，因此创建新实例
            Flyweight fly = new ConcreteFlyweight(state);
            //将实例存储到聚集中
            flies.put(state, fly);
            //将实例返还
            return fly;
        }
    }

    public void checkFlyweight() {
        Flyweight fly;
        int i = 0;
        System.out.println("==========checkFlyweight()===========");
        for (Iterator it = flies.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item" + (++i) + ":" + e.getKey());
        }
        System.out.println("==========checkFlyweight()==========");

    }


}
