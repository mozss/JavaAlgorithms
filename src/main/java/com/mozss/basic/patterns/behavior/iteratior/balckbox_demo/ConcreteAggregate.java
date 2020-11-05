package com.mozss.basic.patterns.behavior.iteratior.balckbox_demo;

/**
 * @author mozss
 * @create 2019-10-28 13:59
 */

public class ConcreteAggregate extends Aggregate {
    private final Object[] obj = {"Monk Tang", "Monkey", "Pigsy", "Sandy", "Horse"};

    /*
     * 返回有一个迭代子对象
     * */
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    /*
     * 内部成员类：具体迭代子类
     * */
    private class ConcreteIterator implements Iterator {
        private int currentIndex = 0;

        /*
         * 移动到第一个元素
         * */
        @Override
        public void first() {
            currentIndex = 0;
        }

        /*
         * 移动到下一个元素
         * */
        @Override
        public void next() {
            if (currentIndex < obj.length) {
                currentIndex++;
            }
        }

        /*
         * 是否有最后一个元素
         * */
        @Override
        public boolean isDone() {
            return (currentIndex == obj.length);
        }

        /*
         * 返回当前元素
         * */
        @Override
        public Object currentItem() {
            return obj[currentIndex];
        }
    }
}
