package com.tahabozdemir.ticketsystempattern.strategy.impl;

import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import org.springframework.stereotype.Component;

@Component
public class BusStrategy implements TravellingStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by bus to İstanbul, Bursa, Ankara, Antalya");
    }
}
