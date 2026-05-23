package com.ticketapp.services;

import com.ticketapp.models.Ticket;

public interface TicketService {

    void addTicket(Ticket ticket);

    void displayTickets();
}