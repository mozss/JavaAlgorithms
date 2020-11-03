package com.mozss.basic.patterns.behavior.state.taoistion_demo.demo;

/**
 * @author mozss
 * @create 2019-10-27 13:31
 */

public class WallEntry {
    private WallStateIF state;

    public void setState(WallStateIF state) {
        this.state = state;
    }

    public WallStateIF getState() {
        return state;
    }

    public void pass() throws WallEntryException {
        state.pass(this);
    }

    public void spell(String spell) throws WallEntryException {
        state.spell(this, spell);
    }
}
