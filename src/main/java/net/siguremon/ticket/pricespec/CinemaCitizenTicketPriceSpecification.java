package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

public class CinemaCitizenTicketPriceSpecification implements TicketPriceSpecification {
    @Override
    public boolean isSatisfied(User user, MovieSchedule movieSchedule) {
        return user.isCinemaCitizen()
                && !movieSchedule.isHoliday() || (movieSchedule.isHoliday() && movieSchedule.isLate());
    }

    @Override
    public int price() {
        return 1000;
    }
}
