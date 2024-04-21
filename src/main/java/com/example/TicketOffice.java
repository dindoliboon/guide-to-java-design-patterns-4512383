package com.example;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
        buyABusTicket();
        buyATrainTicket();
    }

    private static void buyABusTicket() {
        var ticket = ticketMachine.createTicket("bus");
        System.out.println("One bus ticket purchased. The price is $" + ticket.getPrice() + ".");
    }

    private static void buyATrainTicket() {
        var ticket = ticketMachine.createTicket("train");
        System.out.println("One train ticket purchased. The price is $" + ticket.getPrice() + ".");
    }
}
