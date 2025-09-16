package com.tahabozdemir.ticketsystempattern.chain;

import com.tahabozdemir.ticketsystempattern.model.Ticket;

public interface TravelChain {
    void setNextChain(TravelChain nextHandler);
    void travelWith(Ticket ticket);
}