package lab12;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {

        // Creating LocalDate and LocalTime instance
        LocalDate date1 = LocalDate.of(2024, 11, 8);  // 2024-11-08
        LocalDate date2 = LocalDate.parse("2024-09-01");  // 2024-09-01
        LocalDate now = LocalDate.now();
        LocalDate date3 = LocalDate.ofYearDay(2024, 333); // 2024-11-28
        // LocalDate date4 = LocalDate.ofYearDay(2024, 433); // throws DateTimeException

        LocalTime time1 = LocalTime.of(11, 45); // 11:45
        LocalTime time2 =  LocalTime.of(11, 45, 30); // 11:45:30
        LocalTime time3 =  LocalTime.parse("11:45:30"); // 11:45:30
        LocalTime nowTime = LocalTime.now();
        LocalTime time4 = LocalTime.ofSecondOfDay(12345); // 03:25:45
        // LocalTime time5 = LocalTime.of(24, 1, 1); //  throws DateTimeException

        LocalDateTime dateTime1 = LocalDateTime.of(2024, 11, 15, 22, 30);
        LocalDateTime dateTime2 = LocalDateTime.parse("2024-11-15T22:30");
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime dateTime3 = LocalDateTime.of(date1, time1); // 2024-11-08T11:45
        LocalDateTime dateTime4 = date2.atTime(time2); // 2024-09-01T11:45:30
        LocalDateTime dateTime5 = time3.atDate(date3); // 2024-11-28T11:45:30


        //  get year, month, day and length (hours, minutes and seconds)
        LocalDate date = LocalDate.of(2024, 11, 8);
        int year = date.getYear(); // 2024
        int month = date.getMonthValue(); // 11
        int dayOfMonth = date.getDayOfMonth(); // 8
        int dayOfYear = date.getDayOfYear();  // 313

        LocalTime time = LocalTime.of(11, 45, 30);
        int hour = time.getHour();   // 11
        int minute = time.getMinute(); // 45
        int second = time.getSecond(); // 30
        int secondOfDay = time.toSecondOfDay(); // 42330

        LocalDateTime dateTime = LocalDateTime.of(2024, 11, 8, 10, 15);
        int month1 = dateTime.getMonthValue(); // 11
        int day1 = dateTime.getDayOfMonth(); // 8
        int hour1 = dateTime.getHour(); // 10
        int minute1 = dateTime.getMinute(); // 15
        LocalDate dateOf = dateTime.toLocalDate(); // 2024-11-08
        LocalTime timeOf = dateTime.toLocalTime(); // 10:15


        // Arithmetic methods
        LocalDate tomorrow = date.plusDays(1);    // 2024-11-09
        LocalDate yesterday = date.minusDays(1);  // 2024-11-07
        LocalDate inTwoYears = date.plusYears(2); // 2026-11-08
        LocalDate in2020 = date.withYear(2020);   // 2020-11-08

        LocalTime time5 = time.plusHours(5); // 16:45:30
        LocalTime time6 = time.plusHours(22); // 09:45:30
        LocalTime time7 = time.minusMinutes(10); // 11:35:30
        LocalTime time8 = time.minusSeconds(30); // 11:45


        // Comparing dates and time
        LocalTime time9 = LocalTime.parse("15:30:10");
        LocalTime time10 = LocalTime.parse("17:50:30");
        System.out.println(time10.compareTo(time9)); // 1

        LocalDate date4 = LocalDate.of(2024, 9, 1);
        LocalDate date5 = LocalDate.of(2024, 11, 30);

        System.out.println(date4.isEqual(date5)); // false
        System.out.println(date4.isBefore(date5)); // true
        System.out.println(date5.isAfter(date4)); // true


        // Period and Duration
        LocalDate startDate = LocalDate.of(1995, 5, 23);
        LocalDate endDate = LocalDate.of(1995 , 8, 25);
        Period period = Period.between(startDate, endDate);
        System.out.println(period); // P3M2D

        Period period2 = Period.of(1, 1, 1);
        System.out.println(period2.addTo(LocalDate.of(1995, 5, 23))); // 1996-06-24
        System.out.println(period2.subtractFrom(LocalDate.of(1995, 5, 23))); // 1994-04-22
        System.out.println(period2); // P1Y1M1D

        LocalTime startTime = LocalTime.of(11, 45, 30);
        LocalTime endTime = LocalTime.of(12, 50, 30);
        System.out.println(Duration.between(startTime, endTime)); // PT1H5M

        Duration duration = Duration.of(90, ChronoUnit.MINUTES);
        System.out.println(duration.addTo(LocalTime.of(19, 5, 23))); // 20:35:23
        System.out.println(duration.subtractFrom(LocalTime.of(19, 5, 23))); // 17:35:23
        System.out.println(duration); // PT1H30M
    }
}
