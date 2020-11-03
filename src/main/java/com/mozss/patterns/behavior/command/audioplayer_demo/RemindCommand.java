package com.mozss.patterns.behavior.command.audioplayer_demo;

/**
 * @author mozss
 * @create 2019-10-26 18:04
 */

public class RemindCommand implements Command {
    private AudioPlayer myAudio;

    /*
     * 构造函数
     * */
    public RemindCommand(AudioPlayer a) {
        myAudio = a;
    }

    /*
     * 执行方法
     * */
    @Override
    public void execute() {
        myAudio.rewind();
    }
}
