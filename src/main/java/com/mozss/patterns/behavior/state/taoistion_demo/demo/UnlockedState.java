package com.mozss.patterns.behavior.state.taoistion_demo.demo;

import java.util.Date;

/**
 * @author mozss
 * @create 2019-10-27 13:41
 */
/*
 * 这个具体包装类包装了墙在“开”状态时候的行为
 * */
public class UnlockedState implements WallStateIF {
    private Date timeOfUnlock;

    public UnlockedState() {
        this.setTimeOfUnlock(new Date());
    }

    @Override
    public void spell(WallEntry wall, String spell) throws WallEntryException {

    }

    @Override
    public void pass(WallEntry wall) throws WallEntryException {
        wall.setState(new LockedState());
    }

    public Date getTimeOfUnlock() {
        return timeOfUnlock;
    }

    public void setTimeOfUnlock(Date timeOfUnlock) {
        this.timeOfUnlock = timeOfUnlock;
    }
}
