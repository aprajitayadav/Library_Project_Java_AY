package library;

import java.time.LocalDate;

interface Reservable {

    boolean isReservable();

    LocalDate reservedDate();

    int reservationLengthInDays();

}