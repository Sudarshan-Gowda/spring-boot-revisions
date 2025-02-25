package com.star.sud.spring.bus.config;

public class BusRunner2 {

    public BusConsole2 busConsole;

    BusRunner2(BusConsole2 busConsole) {
        this.busConsole = busConsole;
    }

    void run() {
        System.out.println("Bus Type: " + busConsole.busType());
        System.out.println("Src: " + busConsole.source());
        System.out.println("Dest: " + busConsole.destination());
        System.out.println("Price :" + busConsole.price());
    }

}
