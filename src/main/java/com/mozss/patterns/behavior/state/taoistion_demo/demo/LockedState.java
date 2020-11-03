package com.mozss.patterns.behavior.state.taoistion_demo.demo;

import java.util.Date;

/**
 * @author mozss
 * @create 2019-10-27 13:35
 */

public class LockedState implements WallStateIF {
    private static String rightSpell = "天机不可泄露";
    private Date timeOfLock;

    public LockedState() {
        this.setTimeOfLock(new Date());
    }

    @Override
    public void spell(WallEntry wall, String spell) throws WallEntryException {
        if (spell.equals(this.rightSpell)) {
            wall.setState(new UnlockedState());
        } else {
            throw new WallEntryException("错误的口诀（spell）！！！");
        }

    }

    @Override
    public void pass(WallEntry wall) throws WallEntryException {
        throw new WallEntryException("Bang!!!");
    }

    public Date getTimeOfLock() {
        return timeOfLock;
    }

    private void setTimeOfLock(Date timeOfLock) {
        this.timeOfLock = timeOfLock;
    }
}
