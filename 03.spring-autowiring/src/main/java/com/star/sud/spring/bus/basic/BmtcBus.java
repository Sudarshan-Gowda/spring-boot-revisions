package com.star.sud.spring.bus.basic;

public class BmtcBus implements  BusConsole{
    @Override
    public String busType() {
        return "BMTC";
    }

    @Override
    public String source() {
        return "Majestic";
    }

    @Override
    public String destination() {
        return "Whitefield";
    }

    @Override
    public String price() {
        return "200";
    }

    @Override
    public String toString() {
        return this.busType() + " "+ this.source() + " "+ this.destination();
    }
}
