package lab8;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
//        String s1 = "I study Java";
//        String s2 = new String("I study Java");
//        String s3 = new String(s2);
//        String s4 = null;
//        char[] arr = {'J', 'A', 'V', 'A'};
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
//
//        String s5 = new String(arr);
//        System.out.println(s5);
//
//        char[] arr2 = s5.toCharArray();
//        System.out.println(Arrays.toString(arr2));
//

        // length() and charAt()
//        String s6 = "Hello World";
//        int length = s6.length();
//        System.out.println(length); // 11
//
//        System.out.println(s6.charAt(0)); // H
//        char c = s6.charAt(6);
//        System.out.println(s6.charAt(6)); // W
//
//        String s7 = s6.charAt(0) + "i" + " to everyone!";
//        System.out.println(s7);

        //Concatenating strings
//        String s8 = "Hello ";
//        String s9 = "World";
//        String s10 = "Hello " + "World";
//        String s11 = s8 + s9;
//        String s12 = s8.concat(s9);
//        String s13 = s8.concat(s9).concat("!");
//        System.out.println(s13);
//
//        String s14 = s8 + (25 + 25); // "Hello 50"
//        System.out.println(s14);
//        String s15 = 25 + 25 + s8; // "50Hello"
//        System.out.println(s15);

        // Basics methods
//        String text = "I like study Java";
//        boolean empty = text.isEmpty(); // false
//        int i = text.indexOf('a'); // 14
//        System.out.println(i);
//        int i2 = text.lastIndexOf('a'); // 16
//
//        String text1 = text.substring(13, 17);
//        System.out.println(text1);      // Java
//
//        String textInUpperCase = text.toUpperCase(); // "I LIKE STUDY JAVA"
//
//        boolean startsWith = textInUpperCase.startsWith("THE"); // false
//        boolean startsWith2 = textInUpperCase.startsWith("I LIKE"); // true
//        boolean endsWith = textInUpperCase.endsWith("JAVA");
//        System.out.println(endsWith);
//
//        String noSpaces = textInUpperCase.replace("JAVA", "JS"); // "ILIKESTUDYJAVA"
//        System.out.println(noSpaces);
//
//        String text2 = "     I like study Java     \n  \t";
//        String trimmedText = text2.trim(); // "I like study Java"
//        System.out.println(trimmedText);


        //  Exception
//        String str1 = null;
//        //System.out.println(str1.length());
//
//        String str2 = "Java";
//        System.out.println(str2.charAt(-1));


        //equals
//        String st1 = "Java";
//        String st2 = "Java";
//        String st3 = new String("Java");
//        System.out.println(st1 == st3);
//        System.out.println(st1.equals(st3));

        // Splitting the string
        String sentence = "I like study Java very much";
        System.out.println(sentence);
        String[] words = sentence.split(" "); //
        System.out.println(Arrays.toString(words));

    }
}

