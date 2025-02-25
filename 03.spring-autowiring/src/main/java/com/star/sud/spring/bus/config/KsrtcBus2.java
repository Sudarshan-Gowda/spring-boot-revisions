package com.star.sud.spring.bus.config;

public class KsrtcBus2 implements BusConsole2 {
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
