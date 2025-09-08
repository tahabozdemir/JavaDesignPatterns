package com.tahabozdemir.ticketsystempattern.strategy.impl;

import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import org.springframework.stereotype.Component;

@Component
public class PlaneStrategy implements TravellingStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by plane to " +
                "İstanbul, Dalaman, Antalya ");
    }
}
