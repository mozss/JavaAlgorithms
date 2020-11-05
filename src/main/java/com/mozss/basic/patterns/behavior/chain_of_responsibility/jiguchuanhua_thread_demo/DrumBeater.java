package com.mozss.basic.patterns.behavior.chain_of_responsibility.jiguchuanhua_thread_demo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author mozss
 * @create 2019-10-26 16:21
 */
/*
 *贾母-》贾赦-》贾政-》贾宝玉-》贾环
 * */
public class DrumBeater {
    public static boolean stopped = false;
    private static Player firstPlayer;
    Timer timer;

    /*
     * main方法
     * */
    public static void main(String[] args) {
        DrumBeater drumBeater = new DrumBeater();
        JiaMu jiaMu = new JiaMu(null);
        jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
        //开始击鼓过程
        drumBeater.startBeating(1);
        //由贾母开始传花
        firstPlayer = jiaMu;
        firstPlayer.handle();
    }

    /*
     * 调用下面的方法开始击鼓的过程
     * */
    public void startBeating(int stopInSeconds) {
        System.out.println("Drum beating started...");
        timer = new Timer();
        timer.schedule(new StopBeatingReminder(), stopInSeconds * 1000);
    }

    /*
     * 内部成员类，描述停止击鼓的任务
     * */
    class StopBeatingReminder extends TimerTask {
        @Override
        public void run() {
            System.out.println("Drum beating stopped!");
            stopped = true;
            //Terminate the timer therad
            timer.cancel();
        }
    }
}
