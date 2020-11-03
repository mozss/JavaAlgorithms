package com.mozss.patterns.behavior.command.audioplayer_macrocommand_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:42
 */
/*
 * Invoker角色，接收者角色
 * */
public class Keypad {
    private Command playCmd;
    private Command rewindCmd;
    private Command stopCmd;
    /*
     * 构造函数
     * */

    public Keypad(Command play, Command rewind, Command stop) {
        //concrete Command registers itself with the invoker
        playCmd = play;
        rewindCmd = rewind;
        stopCmd = stop;
    }

    /*
     * 行动方法
     * */
    public void play() {
        playCmd.execute();
    }

    /*
     * 行动方法
     * */
    public void rewind() {
        rewindCmd.execute();
    }

    /*
     * 行动方法
     * */
    public void stop() {
        stopCmd.execute();
    }
}
