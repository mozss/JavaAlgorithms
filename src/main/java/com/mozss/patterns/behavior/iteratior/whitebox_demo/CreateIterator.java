package com.mozss.patterns.behavior.iteratior.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-28 13:43
 */

public class CreateIterator implements Iterator {

    private ConcreteAggregate agg;
    private int index = 0;
    private int size = 0;

    /*
     * 构造函数
     * */
    public CreateIterator(ConcreteAggregate agg) {
        this.agg = agg;
        size = agg.size();
        index = 0;
    }

    /*
     * 移动到第一个元素
     * */
    @Override
    public void first() {
        index = 0;
    }

    /*
     * 移动到下一个元素
     * */
    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    /*
     * 是否为最后一个元素
     * */
    @Override
    public boolean isDone() {
        return (index >= size);
    }

    /*
     * 返回当前元素
     * */
    @Override
    public Object currentIterator() {
        return agg.getElement(index);
    }
}
