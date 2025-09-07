package com.tahabozdemir.ticketsystempattern.model;

import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;

public class Traveller {
    private TravellingStrategy strategy;

    public Traveller(TravellingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TravellingStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.travel();
    }
}
