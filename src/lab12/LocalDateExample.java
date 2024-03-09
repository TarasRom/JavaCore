package lab12;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LocalDateExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate1 = LocalDate.parse(scanner.next());
        LocalDate localDate2 = LocalDate.parse(scanner.next());
        LocalDate localDate3 = LocalDate.parse(scanner.next());
        System.out.println(localDate1.isAfter(localDate2) && localDate1.isBefore(localDate3)
        || (localDate1.isAfter(localDate3) && localDate1.isBefore(localDate2)));
    }
}
