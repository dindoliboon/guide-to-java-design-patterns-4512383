package com.example;

public class TicketMachine {

    Ticket createTicket(String ticketType) {
        if (ticketType.equals("bus"))
            return new BusTicket();

        return new TrainTicket();
    }

}
