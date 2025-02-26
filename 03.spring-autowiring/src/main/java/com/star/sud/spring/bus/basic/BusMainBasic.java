package com.star.sud.spring.bus.basic;

public class BusMainBasic {

    public static void main(String[] args) {

        var ksrtc = new KsrtcBus();
        var bmtc = new BmtcBus();
        var runner = new BusRunner(bmtc);
        runner.run();
    }
}
