package com.mozss.basic.patterns.creational.factory.abstract_factory.demo_02;

/**
 * @author mozss
 * @create 2019-09-08 18:53
 */
/*
 * 草莓类
 * */
public class Strawberry implements Fruit {
    /*
     * 有无籽
     * */
    private boolean seedless;

    /*
     * 辅助方法
     * */
    public static void log(String msg) {
        System.out.println(msg);
    }

    @Override
    public void grow() {
        System.out.println("正在生长");
    }

    @Override
    public void harvest() {
        System.out.println("已经收获");
    }

    @Override
    public void plant() {
        System.out.println("已经种植");
    }

    public boolean isSeedless() {
        return seedless;
    }

    /*
     * 有无籽的取值方法
     * */
    public boolean getSeedless() {
        return seedless;
    }

    /*
     * 有无籽的赋值方法
     * */
    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }


}
