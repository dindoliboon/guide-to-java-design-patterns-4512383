package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    public static final Map<String, Supplier<Ticket>> ticketMap = new HashMap();

    static {
        ticketMap.put("Bus", BusTicket::new);
        ticketMap.put("Train", TrainTicket::new);
    }

    Ticket createTicket(String ticketType) {
        Supplier<Ticket> ticketSupplier = ticketMap.get(ticketType);
        if (ticketSupplier != null)
            return ticketSupplier.get();

        throw new IllegalArgumentException("Invalid ticket type");
    }
}
