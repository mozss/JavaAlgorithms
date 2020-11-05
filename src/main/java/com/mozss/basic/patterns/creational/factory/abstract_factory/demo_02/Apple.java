package com.mozss.basic.patterns.creational.factory.abstract_factory.demo_02;

/**
 * @author mozss
 * @create 2019-09-08 18:44
 */
/*
 * 苹果类
 * */
public class Apple implements Fruit {
    private int treeAge;

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

    /*
     * 树龄的取值方法
     * */
    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
