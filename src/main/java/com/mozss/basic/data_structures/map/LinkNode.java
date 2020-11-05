package com.mozss.basic.data_structures.map;

/**
 * @author mozss
 * @create 2019-11-09 18:17
 */

class LinkNode {
    public LinkNode next;
    private final int iData;

    public LinkNode(int iData) {
        this.iData = iData;
    }

    public int getKey() {
        return iData;
    }

    public void displayLink() {
        System.out.println(iData + " ");
    }
}