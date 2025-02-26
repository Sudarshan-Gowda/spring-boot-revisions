package com.star.sud.spring.bus.basic;

public class BusRunner {

    public BusConsole busConsole;

    public BusRunner(BusConsole busConsole){
        this.busConsole = busConsole;
    }

   void run(){
        System.out.println("Bus Type: " + busConsole.busType());
       System.out.println("Src: "+busConsole.source());
       System.out.println("Dest: "+busConsole.destination());
       System.out.println("Price :"+busConsole.price());
   }

    @Override
    public String toString() {
        return busConsole.busType();
    }
}
