package com.mozss.basic.patterns.behavior.chain_of_responsibility.jiguchuanhua_thread_demo;

/**
 * @author mozss
 * @create 2019-10-26 16:35
 */
/*
 *贾母-》贾赦-》贾政-》贾宝玉-》贾环
 * */
public class JiaMu extends Player {
    /*
     * 构造函数，以下一家对象为参数
     * */
    public JiaMu(Player aSuccessor) {
        this.setSuccessor(aSuccessor);
    }

    /*
     * 请求处理方法，调用此方法处理请求
     * */
    @Override
    public void handle() {
        //检查击鼓是否已经停止
        if (DrumBeater.stopped) {
            //执行酒令
            System.out.println("JiaMu is drink");
        } else {
            System.out.println("JiaMu is passed!");
            //将花传给下家
            next();
        }
    }
}
