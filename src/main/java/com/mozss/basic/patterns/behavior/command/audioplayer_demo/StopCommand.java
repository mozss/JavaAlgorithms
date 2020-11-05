package com.mozss.basic.patterns.behavior.command.audioplayer_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:47
 */

public class StopCommand implements Command {
    private final AudioPlayer myAudio;

    /*
     * 构造函数
     * */
    public StopCommand(AudioPlayer a) {
        myAudio = a;
    }

    /*
     * 行动方法
     * */
    @Override
    public void execute() {
        myAudio.stop();
    }
}
