package com.mozss.basic.patterns.behavior.command.simple_demo;

/**
 * @author mozss
 * @create 2019-10-26 17:26
 */

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
