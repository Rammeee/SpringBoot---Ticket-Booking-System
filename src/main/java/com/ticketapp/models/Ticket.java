package com.ticketapp.models;

public class Ticket {

    private int ticketId;
    private String title;
    private User user;

    public Ticket(int ticketId,
                  String title,
                  User user) {

        this.ticketId = ticketId;
        this.title = title;
        this.user = user;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }
}