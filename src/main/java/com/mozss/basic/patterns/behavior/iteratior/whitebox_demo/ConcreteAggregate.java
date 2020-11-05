package com.mozss.basic.patterns.behavior.iteratior.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-28 13:39
 */

public class ConcreteAggregate extends Aggregate {
    private final Object[] obj = {"Monk Tang", "Monkey", "Pigsy", "Sandy", "Horse"};

    /*
     * 工厂方法：返回一个迭代子对象
     * */
    public Iterator createIterator() {
        return new CreateIterator(this);
    }

    /*
     * 取值方法：向外界提供聚集元素
     * */
    public Object getElement(int index) {
        if (index < obj.length) {
            return obj[index];
        } else {
            return null;
        }
    }

    /*
     * 取值方法
     * */
    public int size() {
        return obj.length;
    }
}
