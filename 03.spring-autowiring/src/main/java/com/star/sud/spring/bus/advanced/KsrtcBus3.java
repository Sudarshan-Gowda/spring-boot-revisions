package com.star.sud.spring.bus.advanced;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class KsrtcBus3 implements BusConsole3 {

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
        return this.busType() + " " + this.source() + " " + this.destination();
    }
}
