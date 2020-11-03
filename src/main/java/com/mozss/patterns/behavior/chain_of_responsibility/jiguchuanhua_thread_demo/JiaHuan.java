package com.mozss.patterns.behavior.chain_of_responsibility.jiguchuanhua_thread_demo;

/**
 * @author mozss
 * @create 2019-10-26 16:41
 */
/*
 *贾母-》贾赦-》贾政-》贾宝玉-》贾环
 * */
public class JiaHuan extends Player {
    /*
     * 构造函数，以下一家对象为参数
     * */
    public JiaHuan(Player aSuccessor) {
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
            System.out.println("JiaHuan is drink");
        } else {
            System.out.println("JiaHuan is passed!");
            //将花传给下家
            next();
        }
    }
}
