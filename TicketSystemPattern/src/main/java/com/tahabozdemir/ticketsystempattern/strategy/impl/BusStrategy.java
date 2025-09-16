package com.tahabozdemir.ticketsystempattern.strategy.impl;
import com.tahabozdemir.ticketsystempattern.chain.TravelChain;
import com.tahabozdemir.ticketsystempattern.model.Ticket;
import com.tahabozdemir.ticketsystempattern.strategy.TravellingStrategy;
import org.springframework.stereotype.Component;


@Component
public class BusStrategy implements TravellingStrategy, TravelChain {
    String[] routes = {"Istanbul", "Bursa", "Ankara", "Antalya"};
    private TravelChain chain;

    @Override
    public void travel() {;
        for (String city : routes) {
            System.out.println("Traveling by bus to " + city);
        }
    }

    @Override
    public void setNextChain(TravelChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void travelWith(Ticket ticket) {
        if (ticket.equals(Ticket.BUS)) {
            this.travel();
        } else if (chain != null) {
            chain.travelWith(ticket);
        } else {
            System.out.println("No suitable travel method found.");
        }
    }
}
