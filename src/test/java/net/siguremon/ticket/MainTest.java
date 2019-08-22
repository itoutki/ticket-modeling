package net.siguremon.ticket;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("通常料金")
    void testNormalTicket() {
        Main main = new Main();
        User user = new User(20, false);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 8, 13, 15));
        assertEquals(1800, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("映画の日料金")
    void testMovieDayTicket() {
        Main main = new Main();
        User user = new User(20, false);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 1, 13, 15));
        assertEquals(1100, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("レイトショー料金")
    void testLateTicket1() {
        Main main = new Main();
        User user = new User(20, false);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 8, 20, 15));
        assertEquals(1300, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("レイトショー料金")
    void testLateTicket2() {
        Main main = new Main();
        User user = new User(20, false);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 9, 3, 15));
        assertEquals(1300, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 平日 日中")
    void testCinemaCitizen1() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 7,10, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 平日 日中 映画の日")
    void testCinemaCitizen2() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 1,10, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 平日 夜間")
    void testCinemaCitizen3() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 1,22, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 平日 夜間 映画の日")
    void testCinemaCitizen4() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 1,22, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 休日 日中")
    void testCinemaCitizen5() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 10,13, 0));
        assertEquals(1300, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 休日 日中 映画の日")
    void testCinemaCitizen6() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 9, 1,13, 0));
        assertEquals(1100, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 休日 夜間")
    void testCinemaCitizen7() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 8, 10,21, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }

    @Test
    @DisplayName("シネマシティズン 休日 夜間 映画の日")
    void testCinemaCitizen8() {
        Main main = new Main();
        User user = new User(20, true);
        MovieSchedule movieSchedule = new MovieSchedule(LocalDateTime.of(2019, 9, 1,21, 0));
        assertEquals(1000, main.calculateTicketPrice(user, movieSchedule).price());
    }
    /*
    シネマシティズン 平日 日中         1000
    シネマシティズン 平日 日中 映画の日 1000
    シネマシティズン 平日 夜間         1000
    シネマシティズン 平日 夜間 映画の日 1000
    シネマシティズン 休日 日中         1300
    シネマシティズン 休日 日中 映画の日 1100
    シネマシティズン 休日 夜間         1000
    シネマシティズン 休日 夜間 映画の日 1000
     */

}
