package net.siguremon.ticket.pricespec;

import net.siguremon.ticket.MovieSchedule;
import net.siguremon.ticket.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TicketPriceSpecificationRepository {
    List<TicketPriceSpecification> specificationList;

    public TicketPriceSpecificationRepository() {
        specificationList = new ArrayList<>();
        specificationList.add(new NormalTicketPriceSpecification());
        specificationList.add(new SeniorTicketPriceSpecification());
        specificationList.add(new MovieDayTicketPriceSpecification());
        specificationList.add(new LateTicketPriceSpecification());
        specificationList.add(new CinemaCitizenTicketPriceSpecification());
        specificationList.add(new CinemaCitizenHolidayTicketPriceSpecification());
        specificationList.add(new SeniorCinemaCitizenTicketPriceSpecification());
    }

    public List<TicketPriceSpecification> getSatisfiedSpecifications(User user, MovieSchedule movieSchedule) {
        return specificationList.stream()
                .filter(spec -> spec.isSatisfied(user, movieSchedule))
                .sorted(Comparator.comparing(spec -> spec.price()))
                .collect(Collectors.toList());
    }

    public TicketPriceSpecification getLowestSpecification(User user, MovieSchedule movieSchedule) {
        return getSatisfiedSpecifications(user, movieSchedule).stream()
                .findFirst().orElse(new NormalTicketPriceSpecification());
    }
}
