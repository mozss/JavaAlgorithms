package com.mozss.patterns.behavior.visitor.demo;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author mozss
 * @create 2019-09-17 10:15
 */

public class Demo {


    public void print_01(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void print_02(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Collection) {
                print_02((Collection) o);
            } else {
                System.out.println(o.toString());
            }
        }
    }

    public void print_03(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Collection) {
                print_03((Collection) o);
            } else if (o instanceof String) {
                System.out.println("" + o.toString() + "");
            } else if (o instanceof Double) {
                System.out.println(o.toString() + "D");
            } else if (o instanceof Float) {
                System.out.println(o.toString() + "F");
            } else {
                System.out.println(o.toString());
            }

        }
    }

    /*
     * 由print_01到print_02再到print_03，可以看出条件语句越来越长，代码也越来越难维护
     *
     * 换言之，如果需要针对一个包含不同类型元素的聚集采取某种操作，而操作的细节根据元素的类型不同而有所不同，就会出现必须对元素类型做类型
     * 判断的条件转移语句。这就是双重分派的实际应用。
     *
     * 访问者模式适用于数据结构相对未定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演进。
     * */


}
