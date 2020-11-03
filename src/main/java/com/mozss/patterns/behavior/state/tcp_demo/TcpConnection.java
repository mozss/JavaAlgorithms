package com.mozss.patterns.behavior.state.tcp_demo;

/**
 * @author mozss
 * @create 2019-10-27 13:04
 */

public class TcpConnection {
    private TcpState state;

    public void open() {
        state.open();
    }

    public void setState(TcpState state) {
        this.state = state;
    }

    public void close() {
        state.close();
    }

    public void acknowledge() {
        state.acknowlege();
    }
}
