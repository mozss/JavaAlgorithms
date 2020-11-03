package com.mozss.patterns.behavior.command.audioplayer_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:44
 */

public class PlayCommand implements Command {
    private AudioPlayer myAudio;

    /*
     * 构造函数
     * */
    public PlayCommand(AudioPlayer a) {
        myAudio = a;
    }

    @Override
    public void execute() {
        myAudio.play();
    }
}
