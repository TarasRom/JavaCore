package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());  // true

        list.add("Alice");  // [Alice]
        list.add("Bob");  // [Alice, Bob]
        list.add("Carl");  // [Alice, Bob, Carl]
        list.add("Diana");  // [Alice, Bob, Carl, Diana]

        System.out.println(list.isEmpty());  // false
        System.out.println(list);  // [Alice, Bob, Carl, Diana]

        list.add(2, "Bryan"); // [Alice, Bob, Bryan, Carl, Diana]
        list.set(1, "Bobic"); // [Alice, Bobic, Bryan, Carl, Diana]

        System.out.println(list.get(0)); // Alice
        System.out.println(list.get(1)); // Bobic
        // System.out.println(list.get(10)); // throws IndexOutOfBoundsException

        list.remove("Bobic"); // [Alice, Bryan, Carl, Diana]
        list.remove(3);     // [Alice, Bryan, Carl]
        System.out.println(list.size()); // 3

        List<String> list1 = list.subList(0, 2);
        System.out.println(list1); // [Alice, Bryan]
        list.clear();

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Bob", 19));
        list2.add(new Student("Carl", 20));
        list2.add(new Student("Alice", 21));
        list2.add(new Student("Alice", 20));

        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        // Immutable lists
        List<String> daysOfWeek = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6
        System.out.println(daysOfWeek.indexOf("Holiday")); // -1
        // daysOfWeek.add("Weekend"); // throws UnsupportedOperationException
        // daysOfWeek.set(6, "Holiday"); // throws UnsupportedOperationException

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        List<Integer> fibonacci = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        List<Integer> fibonacciM = new ArrayList<>(fibonacci);
        fibonacciM.add(377);
        fibonacciM.add(233);
        fibonacciM.add(144);

        System.out.println(fibonacciM.contains(13));  // true
        System.out.println(fibonacciM.contains(15));  // false

        System.out.println(fibonacciM);
        Collections.sort(fibonacciM);
        System.out.println(fibonacciM);

        // Iterating over a list

        for (String day : weekDays) {
            System.out.print(day + " ");
        }

        weekDays.forEach(System.out::println);
    }
}
