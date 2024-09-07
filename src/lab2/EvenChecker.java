package lab2;

import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("The number is even: " + isEven(number));
        } else {
            System.out.println("Invalid number! Please, enter integer number.");
        }

        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

