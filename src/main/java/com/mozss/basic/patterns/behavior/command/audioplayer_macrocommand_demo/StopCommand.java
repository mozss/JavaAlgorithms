package com.mozss.basic.patterns.behavior.command.audioplayer_macrocommand_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:47
 */

public class StopCommand implements Command {
    private AudioPlayer myAudio;

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
