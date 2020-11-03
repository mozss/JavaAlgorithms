package com.mozss.basic.patterns.behavior.state.tcp_demo;

/**
 * @author mozss
 * @create 2019-10-27 13:04
 */

public interface TcpState {
    void open();

    void close();

    void acknowlege();
}
