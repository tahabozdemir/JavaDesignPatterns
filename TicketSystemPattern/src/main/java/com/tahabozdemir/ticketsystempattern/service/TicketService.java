package com.tahabozdemir.ticketsystempattern.service;

import com.tahabozdemir.ticketsystempattern.model.Ticket;
import com.tahabozdemir.ticketsystempattern.model.Traveller;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BoatStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.BusStrategy;
import com.tahabozdemir.ticketsystempattern.strategy.impl.PlaneStrategy;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public Traveller travel(Traveller traveller, Ticket ticket) {
        switch (ticket) {
            case PLANE -> traveller.setStrategy(new PlaneStrategy());
            case BOAT -> traveller.setStrategy(new BoatStrategy());
            case BUS -> traveller.setStrategy(new BusStrategy());
        }
        return traveller;
    }
}
