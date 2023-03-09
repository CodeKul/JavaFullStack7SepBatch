package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateTimeApi {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate birthDate = LocalDate.of(1991,9,27);
        Period period = Period.between(localDate,birthDate);
        System.out.println(period);
    }
}
