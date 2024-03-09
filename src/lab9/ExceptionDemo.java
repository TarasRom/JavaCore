package lab9;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

class ExceptionDemo {
    public static void main(String[] args) {
        // ArithmeticException
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        System.out.println(a / b);
//        System.out.println("The end");

        // ArithmeticException

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (b == 0) {
//            System.out.println("Division by zero!");
//        } else {
//            System.out.println(a / b);
//        }
//        System.out.println("The end");


        // NumberFormatException

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        int number = Integer.parseInt(input);
//        System.out.println(number + 1);

//         NumberFormatException
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        if (input.matches("\\d+")) {
//            int number = Integer.parseInt(input);
//            System.out.println(number + 1);
//        } else {
//            System.out.println("Incorrect number: " + input);
//        }

        // NullPointerException
//        String someString = null;
//        //int size = someString.length();
//        int size2 = someString != null ? someString.length() : 0;
//        System.out.println(size2);


        // IndexOutOfBoundsException
//        int[] array = {1, 2, 3};
//        int n1 = array[2]; // 3
//        int n2 = array[5]; // Exception
        // int[] array2 = new int[-5];


//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        int i1 = list.get(0);
//        int i2 = list.get(5); // Exception

//        String s1 = "Hello World";
//        System.out.println(s1.charAt(10));
//        System.out.println(s1.charAt(13)); // Exception

        //The try-catch statement
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a / b);
//            System.out.println("The end of try block");
//        } catch (ArithmeticException | NullPointerException | InputMismatchException e) {
//            System.out.println(e.getMessage());
//        }


        // multiple exceptions
//        try {
//            // code that may throw exceptions
//        } catch (SQLException | IOException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Something goes wrong");
//        }

        // The finally block
//        try {
//            Integer.parseInt("123dsgf");
//            System.out.println("inside the try block");
//        } catch (NumberFormatException e) {
//            System.out.println("inside the catch block");
//        } finally {
//            System.out.println("inside the finally block");
//        }
//
//        System.out.println("after the try-catch-finally block");


        // Throwing unchecked exceptions
//        class Account {
//
//            private long balance = 0;
//
//            public void deposit(long amount) {
//                if (amount <= 0) {
//                    throw new IllegalArgumentException("Incorrect sum " + amount);
//                }
//
//                if (amount >= 100_000_000L) {
//                    throw new IllegalArgumentException("Too large amount");
//                }
//
//                balance += amount;
//            }
//
//            public long getBalance() {
//                return balance;
//            }
//
//        }


        // Throwing checked exceptions
//        public static String readTextFromFile(String path) throws IOException {
//
//            if (!found) {
//                throw new IOException("The file " + path + " is not found");
//            }
        //}


// Custom exceptions
class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

    }

}


