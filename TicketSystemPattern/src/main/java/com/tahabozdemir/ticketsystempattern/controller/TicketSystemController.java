package com.tahabozdemir.ticketsystempattern.controller;

import com.tahabozdemir.ticketsystempattern.model.request.TicketRequest;
import com.tahabozdemir.ticketsystempattern.model.Traveller;
import com.tahabozdemir.ticketsystempattern.service.TicketService;
import com.tahabozdemir.ticketsystempattern.strategy.impl.PlaneStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tickets")
@RequiredArgsConstructor
public class TicketSystemController {
    private final TicketService ticketService;
    private final Traveller traveller = new Traveller(new PlaneStrategy());

    @PostMapping
    public String createTicket(@RequestBody TicketRequest ticket) {
        ticketService.travel(traveller, ticket.ticket()).travel();
        return "Ticket created successfully!";
    }
}
