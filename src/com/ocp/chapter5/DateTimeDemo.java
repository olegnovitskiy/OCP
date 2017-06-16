package com.ocp.chapter5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * Created by olegnovitskiy on 5/30/17.
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2017, Month.MAY, 30);
        System.out.println(date1.equals(date2));
        System.out.println(date1 == date2);

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("Kiev"))
                .forEach(System.out::println);



//        ZoneId zoneId = ZoneId.of("US/Eastern");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(2017, 6, 30, 16, 33, 0, 0, zoneId);
//        System.out.println(zonedDateTime);

        Instant ins = Instant.parse("2015-06-01T16:00:00z");
        System.out.println(ins);

        System.out.println();
    }
}
