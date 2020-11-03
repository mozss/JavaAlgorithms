package com.mozss.patterns.behavior.chain_of_responsibility.jiguchuanhua_thread_demo;

/**
 * @author mozss
 * @create 2019-10-26 16:22
 */

abstract class Player {
    abstract public void handle();

    private Player successor;
    /*
     * 默认构造函数
     * */

    public Player() {
        successor = null;
    }

    /*
     * 赋值方法，调用此方法设定下家
     * */
    protected void setSuccessor(Player aSuccessor) {
        successor = aSuccessor;
    }

    /*
     *公开方法，将“花”传递给下家，如果没有下家，系统停止运行
     * */
    public void next() {
        //判断下家对象是否有效
        if (successor != null) {
            //将请求传给下家
            successor.handle();
        } else {
            //系统停止
            System.out.println("Program is terminating.");
            System.exit(0);
        }
    }


}
