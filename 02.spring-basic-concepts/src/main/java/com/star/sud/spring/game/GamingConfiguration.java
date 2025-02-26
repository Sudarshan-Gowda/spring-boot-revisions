package com.star.sud.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }

    @Primary
    @Bean
    public GamingConsole game2() {
        return new SuperContra();
    }

    @Bean
    @Qualifier("cricketGame")
    public GamingConsole game3(){
        return new Cricket();
    }

    @Bean
    public GameRunner latestGame(GamingConsole game3){
        return new GameRunner(game3);
    }

    @Bean
    public GameRunner latestGame2(@Qualifier("cricketGame") GamingConsole console){
        return new GameRunner(console);
    }
}
