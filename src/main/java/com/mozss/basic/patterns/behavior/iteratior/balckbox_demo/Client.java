package com.mozss.basic.patterns.behavior.iteratior.balckbox_demo;

/**
 * @author mozss
 * @create 2019-10-28 14:08
 */

public class Client {
    private Iterator it;
    private final Aggregate agg = new ConcreteAggregate();

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }

    public void operation() {
        it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentItem().toString());
            it.next();
        }
    }
}
