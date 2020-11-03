package com.mozss.basic.patterns.creational.factory.abstract_factory.demo_01;

/**
 * @author mozss
 * @create 2019-09-08 15:33
 */
/*
 * 静态工厂方法
 * */
public class ArtTracer {
    public static Shape factory(String which) throws BadShapeException {
        if (which.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (which.equalsIgnoreCase("square")) {
            return new Square();
        }
        if (which.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            throw new BadShapeException(which);
        }
    }
}
