package net.siguremon.ticket;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class MovieSchedule {

    LocalDateTime startDateTime;

    public MovieSchedule(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public boolean isSpecial() {
        return false;
    }

    public boolean isMovieDay() {
        return this.startDateTime.getDayOfMonth() == 1;
    }

    public boolean isHoliday() {
        return startDateTime.getDayOfWeek() == DayOfWeek.SATURDAY
                || startDateTime.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public boolean isLate() {
        return this.startDateTime.getHour() >= 20 || this.startDateTime.getHour() <= 5;
    }
}
