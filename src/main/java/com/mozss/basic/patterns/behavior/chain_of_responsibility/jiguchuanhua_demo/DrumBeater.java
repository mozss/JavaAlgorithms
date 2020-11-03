package com.mozss.basic.patterns.behavior.chain_of_responsibility.jiguchuanhua_demo;

/**
 * @author mozss
 * @create 2019-10-15 19:27
 */
/*
 *客户端类DrumBeater
 * */
public class DrumBeater {
    private static Player player;

    public static void main(String[] args) {
        //创建责任链
        player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaHuan(null))));
        //规定由第四个处理者处理请求
        player.handle(4);
    }
}
