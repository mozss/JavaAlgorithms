package com.mozss.basic.patterns.behavior.chain_of_responsibility.jiguchuanhua_demo;

/**
 * @author mozss
 * @create 2019-10-15 19:28
 */
/*
 * 1.设置请求处理方法handle(),这是一个抽象方法
 * 2.setSuccessor()方法，可以设定下家，这是一个具体方法
 * 3.向下家传花的方法next(),这是一个抽象方法
 * */
public abstract class Player {
    private Player successor;

    /*
     * 默认构造函数
     * */
    public Player() {
        successor = null;
    }

    /*
     * 1.请求处理方法，调用此方法处理请求
     * */
    abstract public void handle(int i);

    /*
     * 2.赋值方法，调用此方法设定下家
     * */
    public void setSuccessor(Player aSuccessor) {
        successor = aSuccessor;
    }

    /*
     * 3.公开方法，将“花”传给下家：如果没有下家，系统停止工作
     * */
    public void next(int index) {
        //判断下家对象是否有效
        if (successor != null) {
            //将请求传给下家
            successor.handle(index);
        } else {
            //系统停止运行
            System.out.println("系统停止运行");
            System.exit(0);
        }
    }
}
