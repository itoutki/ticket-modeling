package net.siguremon.ticket;

import net.siguremon.ticket.pricespec.TicketPriceSpecification;
import net.siguremon.ticket.pricespec.TicketPriceSpecificationRepository;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public TicketPriceSpecification calculateTicketPrice(User user, MovieSchedule movieSchedule) {
        TicketPriceSpecificationRepository repository = new TicketPriceSpecificationRepository();
        return repository.getLowestSpecification(user, movieSchedule);
    }
}
