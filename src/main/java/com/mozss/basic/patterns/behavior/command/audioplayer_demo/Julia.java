package com.mozss.basic.patterns.behavior.command.audioplayer_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:42
 */
/*
 * 客户端角色
 * */
public class Julia {
    private static Keypad keypad;
    private static final AudioPlayer myAudio = new AudioPlayer();

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Command play = new PlayCommand(myAudio);
        Command stop = new StopCommand(myAudio);
        Command remind = new RemindCommand(myAudio);
        keypad = new Keypad(play, stop, remind);
        keypad.play();
        keypad.stop();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}
