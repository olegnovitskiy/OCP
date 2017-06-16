package com.ocp.chapter6;

import java.math.BigDecimal;
import java.time.*;
import java.util.Locale;

import static java.time.temporal.ChronoField.INSTANT_SECONDS;

class Car implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Close block");
        throw new IllegalStateException("Supressed Exception");
    }
}

public class AutoclosableDemo {
    public static void main(String[] args) throws Exception {

        System.out.println(Period.of(1,2,3));       // P1Y2M3D
        System.out.println(Period.ofMonths(3));     // P3M
        System.out.println(Period.ofYears(1));      // P1Y
        System.out.println(Period.ofWeeks(5));      // P35D => 7*5 = 35 days
        System.out.println(Period.parse("P2W"));    // P14D

        // The start date is INCLUDED, but NOT the end date!
        System.out.println(Period.between(LocalDate.of(2017, Month.JUNE, 3),
                LocalDate.of(2017, Month.JUNE, 2)));// P-1D
        System.out.println(Period.between(LocalDate.of(2017, Month.JUNE, 2),
                LocalDate.of(2017, Month.AUGUST, 3)));// P2M1D
        System.out.println();

        Instant now = Instant.now();
        System.out.println(now.getLong(INSTANT_SECONDS)); // 1496408865
        System.out.println(now.getEpochSecond());         // 1496408865
        Instant later = Instant.now().plusSeconds(100);

        // Search my current time zone
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("Kiev"))
                .forEach(System.out::println);            // Europe/Kiev
        System.out.println("Without time zone: " + later);// 2017-06-02T13:10:09.673Z
        System.out.println("With time zone: "
                + later.atZone(ZoneId.of("Europe/Kiev")));// 2017-06-02T16:10:09.673+03:00[Europe/Kiev]
        Duration duration = Duration.between(now, later);
        System.out.println("Duration: " + duration.toMillis()); // 100000



        Locale locale = Locale.getDefault();
        System.out.println(locale);

        // Variant 1
        System.out.println(Locale.GERMAN);   // "de"
        System.out.println(Locale.GERMANY);  // "de_DE"
        // Variant 2
        System.out.println(new Locale("fr"));   // fr
        System.out.println(new Locale("fr", "US")); // fr_US
        System.out.println(new Locale("ahaha", "AHAHA")); // "ahaha_AHAHA" - Valid, but maybe
                                                          // strange program behavior :)
        // Variant 3
        Locale locale1 = new Locale.Builder()
                .setLanguage("fr")
                .setRegion("US")
                .build();
        System.out.println(locale1);    // fr_US
        Locale locale2 = new Locale.Builder()
                .setRegion("uS")
                .setLanguage("FR")
                .build();
        System.out.println(locale2);    // fr_US

        BigDecimal two = new BigDecimal(2);
        BigDecimal three = new BigDecimal(3);
        BigDecimal result = two.divide(three, 3, 3);
        System.out.println(BigDecimal.ONE.divide(BigDecimal.TEN).multiply(BigDecimal.TEN).compareTo(BigDecimal.ONE));
        
    }

}
