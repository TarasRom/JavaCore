package lab8;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "I like study Java";
        String str2 = new String("I study Java");
        String str3 = new String(str2);
        String str4 = null;
        String str5 = "";
        String str6 = "s";

        char[] array = {'J', 'A', 'V', 'A'};
        System.out.println(Arrays.toString(array));  // [J, A, V, A]

        String str7 = new String(array);
        String str8 = String.valueOf(array);  //  JAVA
        char[] array2 = str7.toCharArray();  // [J, A, V, A]

        // methods length() and charAt()
        String str = "Hello World";
        int length = str.length();  // 11

        char c = str.charAt(0);  // H
        System.out.println(str.charAt(6));  // W

        String st = str.charAt(0) + "i" + " to everyone!";
        System.out.println(st);  // Hi to everyone!


        // Concatenating strings
        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + " " + s2;  // Hello World!
        String s4 = "Hello" + " " + "World!";  // Hello World!
        String s5 = s1.concat(" ").concat(s2);

        String s6 = s1 + 25 + 25;
        System.out.println(s6);  // Hello2525
        String s7 = 25 + 25 + s1;
        System.out.println(s7);  // 50Hello


        // Basics methods of strings
        String text = "I like study Java";

        boolean empty = text.isEmpty(); // false

        int num = text.indexOf('a');  // 14
        int num2 = text.lastIndexOf('a'); // 16

        String text1 = text.substring(13, 17);
        System.out.println(text1);  // Java

        String textInUpperCase = text.toUpperCase(); // I LIKE STUDY JAVA

        boolean startsWith = textInUpperCase.startsWith("A"); // true
        boolean startsWith2 = textInUpperCase.startsWith("I LIKE"); // true
        boolean endsWith = textInUpperCase.endsWith("JAVA");  // true

        String noSpaces = textInUpperCase.replace("JAVA", "PYTHON"); // I LIKE STUDY PYTHON
        System.out.println(noSpaces.replace(" ", "_"));  // I_LIKE_STUDY_PYTHON

        String text2 = "           I    like study Java \n  \t";
        String trimmedText = text2.trim(); // I    like study Java


        // Exceptions
        String s = null;
        // int length1 = s.length(); // throws NullPointerException

        String string = "Java";
        // char c1 = string.charAt(4);  // throws StringIndexOutOfBoundsException


        // Comparing Strings
        String st1 = "Java";
        String st2 = new String("Java");
        System.out.println(st1.equals(st2));  // true


        // Splitting the String
        String sentence = "I like     study \n\t\r Java very much";
        String[] words = sentence.split("\\s+");
        System.out.println(Arrays.toString(words));  // [I, like, study, Java, very, much]

        String st3 = "Hello";
        String[] parts = st3.split(""); // {"H", "e", "l", "l", "o"}

        String st4 = "It's not a good idea to study C++";
        String[] parts2 = st4.split(" a good idea "); // [It's not, to study C++]


    }
}
