package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

public interface TicketPriceSpecification {
    public boolean isSatisfied(User user, MovieSchedule movieSchedule);
    public int price();
}
