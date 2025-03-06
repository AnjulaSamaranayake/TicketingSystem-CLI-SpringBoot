package com.Anjula.TicketingSystem.cli;

public class Vendor extends Thread {
    private TicketPool ticketPool;
    private Config config;

    public Vendor(TicketPool ticketPool, Config config) {
        this.ticketPool = ticketPool;
        this.config = config;
    }

    @Override
    public void run() {
        System.out.println("Vendor thread is running...");
        // Add thread logic here
    }
}




