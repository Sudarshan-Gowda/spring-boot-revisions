package com.star.sud.spring.bus.advanced;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusRunner3 {

    private BusConsole3 busConsole;

    public BusRunner3(@Qualifier("bmtcBus31") BusConsole3 busConsole) {
        this.busConsole = busConsole;
    }

    void run() {
        System.out.println("Bus Type: " + busConsole.busType());
        System.out.println("Src: " + busConsole.source());
        System.out.println("Dest: " + busConsole.destination());
        System.out.println("Price :" + busConsole.price());
    }

    @Override
    public String toString() {
        return "In Game Runner";
    }
}
