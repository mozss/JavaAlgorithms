package com.mozss.algorithms.data_structures.list;

/**
 * @author mozss
 * @create 2019-11-08 18:57
 */

/*
 * 有序列表的实现
 * */
public class OrderLinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public OrderLinkedList() {
        head = null;
    }

    //插入节点，并按照从小打到的顺序排列
    public void insert(int value) {
        Node node = new Node(value);
        Node pre = null;
        Node current = head;
        while (current != null && value > current.data) {
            pre = current;
            current = current.next;
        }
        if (pre == null) {
            head = node;
            head.next = current;
        } else {
            pre.next = node;
            node.next = current;
        }
    }

    //删除头节点
    public void deleteHead() {
        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

}

