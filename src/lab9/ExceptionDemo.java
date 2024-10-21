package lab9;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  ArithmeticException
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();

//        System.out.println(num1 / num2);  // might throw ArithmeticException
//        System.out.println("The end");

//        if (num2 == 0) {
//            System.out.println("Division by zero!");
//        } else {
//            System.out.println(num1 / num2);
//        }
//        System.out.println("The end");

//
//        // NumberFormatException
//        String input = scanner.nextLine();
//
//        int number = Integer.parseInt(input); // might throw NumberFormatException
//        System.out.println(number + 1);
//
//        if (input.matches("\\d+")) {
//            int number2 = Integer.parseInt(input);
//            System.out.println(number2 + 1);
//        } else {
//            System.out.println("Incorrect number: " + input);
//        }

        // NullPointerException
//        String someString = null;
//        int size = someString.length();  // throws NullPointerException
//
//        int size2 = someString != null ? someString.length() : 0;
//        System.out.println(size2);


        // IndexOutOfBoundsException
//        int[] array = {1, 2, 3};
//        int n1 = array[2];  // 3
//        int n2 = array[5];  // throws ArrayIndexOutOfBoundsException
//        int[] array2 = new int[-5]; // throws NegativeArraySizeException


//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        int i1 = list.get(0);
//        int i2 = list.get(5); // throws IndexOutOfBoundsException

//        String s1 = "Hello World";
//        System.out.println(s1.charAt(10));
//        System.out.println(s1.charAt(13)); // throws StringIndexOutOfBoundsException

        // The try-catch statement
//        try {
//            System.out.print("Enter two numbers: ");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a / b);
//            System.out.println("The end of try block");
//        } catch (ArithmeticException | InputMismatchException e) {
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
//            Integer.parseInt("123");
//            System.out.println("inside the try block");
//        } catch (NumberFormatException e) {
//            System.out.println("inside the catch block");
//        } finally {
//            System.out.println("inside the finally block");
//        }
//
//        System.out.println("after the try-catch-finally block");


        // Throwing unchecked exceptions
//        throw new Exception("An exception occurs");
//        throw new NullPointerException("The field is null");

    }

    // Throwing checked exceptions
//    public static String readLineFromFile() throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("file.txt")); // throws FileNotFoundException
//        return sc.nextLine();
//    }

}



