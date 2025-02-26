package com.star.sud.spring.bus.advanced;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bmtcBus31")
public class BmtcBus3 implements BusConsole3 {

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
        return this.busType() + " " + this.source() + " " + this.destination();
    }
}
