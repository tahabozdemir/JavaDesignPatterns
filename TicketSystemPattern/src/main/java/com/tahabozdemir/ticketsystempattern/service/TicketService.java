package com.tahabozdemir.ticketsystempattern.service;

import com.tahabozdemir.ticketsystempattern.chain.TravelChain;
import com.tahabozdemir.ticketsystempattern.model.Ticket;
import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BoatStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BusStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.PlaneStrategy;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final PlaneStrategy planeStrategy;
    private final BusStrategy busStrategy;
    private final BoatStrategy boatStrategy;
    private Map<Ticket, TravellingStrategy> strategyMap;
    private TravelChain travelChain;

    @PostConstruct
    public void init() {
        busStrategy.setNextChain(boatStrategy);
        boatStrategy.setNextChain(planeStrategy);
        this.travelChain = busStrategy;

//         strategyMap = Map.of(
//                Ticket.PLANE, planeStrategy,
//                Ticket.BUS, busStrategy,
//                Ticket.BOAT, boatStrategy
//        );
    }

    public void travel(Ticket ticket) {
//         strategyMap.get(ticket).travel();
        travelChain.travelWith(ticket);
    }
}
