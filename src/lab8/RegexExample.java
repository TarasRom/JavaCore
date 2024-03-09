package lab8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the phone number");
//
//        boolean b = false;
//        //String regex = "\\+38-[0-9]{3}-[0-9]{7}";
//        //String regex = "\\+38-0(50|67)-\\d{7}";
//        String regex = "[\\w.]{2,20}@[a-z]{1,16}\\.[a-z]{2,10}";
//
//        // \\d []
//        // \\w [a-zA-Z0-9_]
//
//        while (!b) {
//            String number = scanner.nextLine();
//            if (number.matches(regex)) {
//                System.out.println("Correct");
//                b = true;
//            } else {
//                System.out.println("Incorrect number");
//            }
//        }



        String s = "Hello javaWorld! We came with peace! JAjavaVA jAVa JJa JJAv";
        Pattern pattern = Pattern.compile("\\bjava\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
