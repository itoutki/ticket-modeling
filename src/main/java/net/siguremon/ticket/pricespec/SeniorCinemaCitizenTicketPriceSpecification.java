package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

public class SeniorCinemaCitizenTicketPriceSpecification implements TicketPriceSpecification {
    @Override
    public boolean isSatisfied(User user, MovieSchedule movieSchedule) {
        return user.isSeniorCinemaCitizen();
    }

    @Override
    public int price() {
        return 1000;
    }
}
