package com.mozss.patterns.behavior.state.taoistion_demo.demo;

/**
 * @author mozss
 * @create 2019-10-27 13:29
 */

public interface WallStateIF {
    void spell(WallEntry wall, String spell) throws WallEntryException;

    void pass(WallEntry wall) throws WallEntryException;
}
