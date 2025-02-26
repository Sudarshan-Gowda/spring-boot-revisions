package com.star.sud.spring.bus.config;

import com.star.sud.spring.bus.basic.BusConsole;
import com.star.sud.spring.bus.basic.BusRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BusConig2 {


    @Bean
    public BusConsole2 ksrtcBusRunner() {
        return new KsrtcBus2();
    }

    @Primary
    @Bean
    public BusConsole2 bmtcBusRunner() {
        return new BmtcBus2();
    }

    @Bean
    @Qualifier("bmtcBusRunner2")
    public BusConsole2 bmtcBusRunner2() {
        return new BmtcBus2();
    }

    @Bean
    public BusRunner2 busRunner() {
        return new BusRunner2(ksrtcBusRunner());
    }

    @Bean
    public BusRunner2 busRunner2(@Qualifier("bmtcBusRunner2") BusConsole2 bmtcBusRunner2) {
        return new BusRunner2(bmtcBusRunner2);
    }

    @Bean
    public BusRunner2 busRunner3(BusConsole2 bmtcBusRunner) {
        return new BusRunner2(bmtcBusRunner);
    }

}
