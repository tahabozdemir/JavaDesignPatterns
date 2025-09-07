package com.tahabozdemir.ticketsystempattern.strategy.impl;

import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;

public class BusStrategy implements TravellingStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by bus to İstanbul, Bursa, Ankara, Antalya");
    }
}
