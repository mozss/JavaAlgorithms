package com.mozss.basic.patterns.behavior.command.audioplayer_macrocommand_demo;

import java.util.Vector;

/**
 * @author mozss
 * @create 2019-10-26 20:15
 */

public class MacroAudioCommand implements MacroCommand {
    private final Vector commandList = new Vector();

    /*
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     * */
    public void remove(int index) {
        commandList.remove(index);
    }

    @Override
    public void remove(Command toRemove) {
        commandList.removeElement(toRemove);
    }

    /*
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     * */
    @Override
    public void add(Command toAdd) {
        commandList.addElement(toAdd);
    }

    /*
     * 执行方法
     * */
    public void execute() {
        Command nextCommand;
        System.out.println("Automated playback of stored commands...");
        for (int i = 0; i < commandList.size(); i++) {
            nextCommand = (Command) commandList.elementAt(i);
            nextCommand.execute();
        }
        System.out.println("Finished automated playback of stored commands...");
    }
}
