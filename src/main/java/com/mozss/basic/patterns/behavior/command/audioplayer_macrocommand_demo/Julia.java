package com.mozss.basic.patterns.behavior.command.audioplayer_macrocommand_demo;

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
        test2();
    }

    private static void test2() {
        Command play = new PlayCommand(myAudio);
        Command stop = new StopCommand(myAudio);
        Command remind = new RemindCommand(myAudio);
        MacroCommand macro = new MacroAudioCommand();
        keypad = new Keypad(play, stop, remind);
        keypad.play();
        keypad.stop();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}
