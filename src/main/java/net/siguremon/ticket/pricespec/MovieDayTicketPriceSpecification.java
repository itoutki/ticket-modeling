package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

public class MovieDayTicketPriceSpecification implements TicketPriceSpecification {
    @Override
    public boolean isSatisfied(User user, MovieSchedule movieSchedule) {
        return movieSchedule.isMovieDay();
    }

    @Override
    public int price() {
        return 1100;
    }
}
