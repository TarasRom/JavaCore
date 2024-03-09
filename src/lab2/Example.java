package lab2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            for (int i = 1; i < 10; i++) {
                int result = number * i;
                System.out.println(number + " * " + i + " = " + result);
            }
        } else {
            System.out.println("Enter the number");
        }
    }
}
