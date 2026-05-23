package com.ticketapp;

import java.util.Scanner;

import com.ticketapp.models.User;
import com.ticketapp.models.Ticket;

import com.ticketapp.services.TicketService;
import com.ticketapp.services.TicketServiceImpl;

import com.ticketapp.exceptions.InvalidAgeException;
import com.ticketapp.exceptions.InvalidTicketException;

import com.ticketapp.util.LoggerUtil;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TicketService service =
                new TicketServiceImpl();

        while (true) {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Add Ticket");
            System.out.println("2. List Tickets");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    try {

                        System.out.print(
                                "Enter Ticket ID: "
                        );

                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print(
                                "Enter Ticket Title: "
                        );

                        String title =
                                scanner.nextLine();

                        if (title.isBlank()) {

                            throw new
                            InvalidTicketException(
                                    "Title cannot be empty"
                            );
                        }

                        System.out.print(
                                "Enter Username: "
                        );

                        String username =
                                scanner.nextLine();

                        System.out.print(
                                "Enter Age: "
                        );

                        int age =
                                scanner.nextInt();

                        scanner.nextLine();

                        if (age < 18) {

                            throw new
                            InvalidAgeException(
                                    "Age must be 18 or above"
                            );
                        }

                        User user =
                                new User(
                                        username,
                                        age
                                );

                        Ticket ticket =
                                new Ticket(
                                        id,
                                        title,
                                        user
                                );

                        service.addTicket(ticket);

                    } catch (
                            InvalidAgeException
                            | InvalidTicketException e
                    ) {

                        System.out.println(
                                "Exception: "
                                + e.getMessage()
                        );

                        LoggerUtil.logError(
                                e.getMessage()
                        );
                    }

                    break;

                case 2:

                    service.displayTickets();

                    break;

                case 3:

                    System.out.println(
                            "Application Closed"
                    );

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice"
                    );
            }
        }
    }
}