package com.tahabozdemir.ticketsystempattern.strategy.impl;

import com.tahabozdemir.ticketsystempattern.model.Route;
import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class PlaneStrategy implements TravellingStrategy {
    private final ArrayList<Route> routes = new ArrayList<>(List.of(
            new Route("İstanbul", 1),
            new Route("Dalaman", 2),
            new Route("Antalya", 3)
    ));

    @Override
    public void travel() {
        routes.stream()
                .sorted(Comparator.comparingInt(Route::getPriority))
                .forEach(route -> {
                    System.out.println("Traveling by plane to " + route.getCity());
                });
    }
}
