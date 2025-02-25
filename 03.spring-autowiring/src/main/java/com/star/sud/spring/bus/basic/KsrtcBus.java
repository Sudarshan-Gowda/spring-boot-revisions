package com.star.sud.spring.bus.basic;

public class KsrtcBus implements  BusConsole{
    @Override
    public String busType() {
        return "KSRTC";
    }

    @Override
    public String source() {
        return "KBS";
    }

    @Override
    public String destination() {
        return "Hassan";
    }

    @Override
    public String price() {
        return "500";
    }

    @Override
    public String toString() {
        return this.busType() + " "+ this.source() + " "+ this.destination();
    }
}
