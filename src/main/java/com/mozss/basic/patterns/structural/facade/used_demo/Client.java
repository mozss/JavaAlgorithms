package com.mozss.basic.patterns.structural.facade.used_demo;

/**
 * @author mozss
 * @create 2019-10-29 16:56
 */

public class Client {
    private static SecurityFacade security;

    /*
     * 可以看出，客户端程序大大简化，只需要对一个SecurityFacade类进行引用就可以
     * */
    public static void main(String[] args) {
        security.active();
    }
}
