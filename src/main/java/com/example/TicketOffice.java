package com.example;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();


    public static void main(String[] args) {
        buyABusTicket();
        buyATrainTicket();
        buyACarTicket();
    }

    private static void buyABusTicket() {
        var ticket = ticketMachine.createTicket("Bus");
        System.out.println("One bus ticket purchased. The price is $" + ticket.getPrice() + ".");
    }

    private static void buyATrainTicket() {
        var ticket = ticketMachine.createTicket("Train");
        System.out.println("One train ticket purchased. The price is $" + ticket.getPrice() + ".");
    }

    private static void buyACarTicket() {
        var ticket = ticketMachine.createTicket("Car");
        System.out.println("One car ticket purchased. The price is $" + ticket.getPrice() + ".");
    }

}
