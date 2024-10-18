package lab8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // +38-050-1234567
        String regex = "\\+38-0(50|97|67)-\\d{7}";

        boolean b = true;
        while (b) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the phone number: ");
            String number = scanner.nextLine();
            if (number.matches(regex)) {
                System.out.println("Correct number");
                b = false;
            } else {
                System.out.println("Incorrect number");
            }
        }


        String text = "We use Java to write modern applications";

        Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());


        String javaText = "Java supports regular expressions. LET'S USE JAVA!!!";

        Pattern pattern2 = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(javaText);

        while (matcher2.find()) {
            System.out.println("group: " + matcher2.group());
        }

    }
}
