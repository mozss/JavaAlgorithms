package com.mozss.patterns.behavior.chain_of_responsibility.jiguchuanhua_demo;

/**
 * @author mozss
 * @create 2019-10-15 19:48
 */
/*
 *贾母-》贾赦-》贾政-》贾宝玉-》贾环
 * */
public class JiaHuan extends Player {
    /*
     * 构造函数，以下家对象为参量
     * */
    public JiaHuan(Player aSuccessor) {
        //如果下方语句报（cannot access ...）错误，属于idea的bug，restart 一下idea即可。
        this.setSuccessor(aSuccessor);
    }

    /*
     * 请求处理方法，调用此方法处理请求
     * */
    @Override
    public void handle(int i) {
        if (i == 5) {
            System.out.println("JiaHuan gotta drink");
        } else {
            System.out.println("JiaHuan passed!");
            next(i);
        }
    }

}
