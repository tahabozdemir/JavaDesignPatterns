package com.tahabozdemir.ticketsystempattern.service;

import com.tahabozdemir.ticketsystempattern.model.Ticket;
import com.tahabozdemir.ticketsystempattern.model.Traveller;
import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BoatStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BusStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.PlaneStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final PlaneStrategy planeStrategy;
    private final BusStrategy busStrategy;
    private final BoatStrategy boatStrategy;

    public void travel(Traveller traveller, Ticket ticket) {
         Map<Ticket, TravellingStrategy> strategyMap = java.util.Map.of(
                Ticket.PLANE, planeStrategy,
                Ticket.BUS, busStrategy,
                Ticket.BOAT, boatStrategy
        );
        traveller.setStrategy(strategyMap.get(ticket));
        traveller.travel();
    }
}
