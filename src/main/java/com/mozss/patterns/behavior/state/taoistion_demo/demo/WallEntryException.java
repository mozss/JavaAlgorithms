package com.mozss.patterns.behavior.state.taoistion_demo.demo;

/**
 * @author mozss
 * @create 2019-10-27 13:28
 */

public class WallEntryException extends Exception {
    public WallEntryException(String message) {
        super(message);
        System.out.println(message);
    }

}
