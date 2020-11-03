package com.mozss.basic.patterns.behavior.command.audioplayer_macrocommand_demo;

/**
 * @author mozss
 * @create 2019-10-26 20:06
 */

public interface MacroCommand extends Command {
    /*
     * 执行方法
     * */
    void execute();

    /*
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     * */
    void remove(Command toRemove);

    /*
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     * */
    void add(Command toAdd);
}
