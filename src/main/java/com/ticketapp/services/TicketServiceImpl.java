package com.ticketapp.services;

import java.util.ArrayList;

import com.ticketapp.models.Ticket;

public class TicketServiceImpl implements TicketService {

    private ArrayList<Ticket> ticketList =
            new ArrayList<>();

    @Override
    public void addTicket(Ticket ticket) {

        ticketList.add(ticket);

        System.out.println(
                "Ticket Added Successfully"
        );
    }

    @Override
    public void displayTickets() {

        if (ticketList.isEmpty()) {

            System.out.println(
                    "No Tickets Available"
            );

            return;
        }

        System.out.println("\n===== TICKET LIST =====");

        for (Ticket ticket : ticketList) {

            System.out.println(
                    "Ticket ID : "
                    + ticket.getTicketId()
            );

            System.out.println(
                    "Title     : "
                    + ticket.getTitle()
            );

            System.out.println(
                    "User      : "
                    + ticket.getUser().getUsername()
            );

            System.out.println(
                    "Age       : "
                    + ticket.getUser().getAge()
            );

            System.out.println();
        }
    }
}