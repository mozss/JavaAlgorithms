package com.mozss.algorithms.data_structures.map;

/**
 * @author mozss
 * @create 2019-11-09 18:17
 */

class LinkNode {
    private int iData;
    public LinkNode next;

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