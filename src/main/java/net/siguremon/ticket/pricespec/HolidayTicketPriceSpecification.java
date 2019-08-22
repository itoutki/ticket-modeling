package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

public class HolidayTicketPriceSpecification implements TicketPriceSpecification {
    @Override
    public boolean isSatisfied(User user, MovieSchedule movieSchedule) {
        return movieSchedule.isHoliday();
    }

    @Override
    public int price() {
        return 0;
    }
}
