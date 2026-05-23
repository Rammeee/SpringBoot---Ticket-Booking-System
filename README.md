# Ticket Booking System

A Java console-based Ticket Booking System developed using Java 17 and Maven.

This project demonstrates:

- Java Packages
- OOP Concepts
- Exception Handling
- Custom Exceptions
- File Handling
- Error Logging
- Menu-Driven Programming
- Maven Project Structure

---

# Features

- Add New Ticket
- Display All Tickets
- Validate User Inputs
- Custom Exception Handling
- Log Exceptions to `error.log`
- Console-based Menu System

---

# Technologies Used

- Java 17
- Maven
- VS Code / IntelliJ
- FileWriter
- Scanner
- ArrayList

---

# Project Structure

```text
TicketBookingSystem/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── ticketapp/
                    │
                    ├── models/
                    │   ├── User.java
                    │   └── Ticket.java
                    │
                    ├── exceptions/
                    │   ├── InvalidAgeException.java
                    │   └── InvalidTicketException.java
                    │
                    ├── services/
                    │   ├── TicketService.java
                    │   └── TicketServiceImpl.java
                    │
                    ├── util/
                    │   └── LoggerUtil.java
                    │
                    └── main/
                        └── App.java
```

---

# Functionalities

## 1. Add Ticket

Users can add a ticket by entering:

- Ticket ID
- Ticket Title
- Username
- Age

Validation is applied for:

- Empty title
- Age below 18

---

## 2. Display Tickets

Displays all added tickets with:

- Ticket ID
- Title
- Username
- Age

---

## 3. Exception Logging

All exceptions are logged into:

```text
error.log
```

Example:

```text
2026-05-22T15:45:20.122 - Age must be 18 or above
```

---

# Maven Commands

## Compile Project

```bash
mvn clean compile
```

---

## Run Application

```bash
mvn exec:java
```

---

# Sample Menu

```text
===== MENU =====
1. Add Ticket
2. List Tickets
3. Exit
```

---

# Sample Output

```text
Enter Choice: 1

Enter Ticket ID: 101
Enter Ticket Title: Movie Ticket
Enter Username: Ravi
Enter Age: 22

Ticket Added Successfully
```

---

# Exception Example

```text
Enter Age: 15

Exception: Age must be 18 or above
```

---

# Learning Outcomes

This project helps understand:

- Java Class Design
- Constructor Usage
- Encapsulation
- Interfaces and Services
- Exception Handling
- File Operations
- Logging
- Maven Project Setup
- Menu-Driven Applications

---

# Author

Developed by Vishnu for Java Maven Practice
