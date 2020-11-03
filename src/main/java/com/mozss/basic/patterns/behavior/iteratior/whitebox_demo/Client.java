package com.mozss.basic.patterns.behavior.iteratior.whitebox_demo;

/**
 * @author mozss
 * @create 2019-10-28 13:50
 */

public class Client {
    private Iterator it;
    private Aggregate agg = new ConcreteAggregate();

    public void operation() {
        it = agg.createIterator();
        while (!it.isDone()) {
            System.out.println(it.currentIterator().toString());
            it.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
