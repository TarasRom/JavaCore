package lab6;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Monday");

        System.out.println(days);
        System.out.println(days.size());


        System.out.println(days.contains("Monday"));  // true
        System.out.println(days.contains("Sunday"));  // false



        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);

        System.out.println(sortedSet); // [10, 13, 15, 17, 21]

        System.out.println(sortedSet.headSet(15)); // [10, 13]
        System.out.println(sortedSet.tailSet(15)); // [15, 17, 21]

        System.out.println(sortedSet.subSet(13, 17)); // [13, 15]

        System.out.println(sortedSet.first()); // 10
        System.out.println(sortedSet.last());  // 21



        Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4));
        numbers.addAll(Set.of(4, 5, 6, 7));

        System.out.println(numbers);  // [1, 2, 3, 4, 5, 6, 7]

        numbers.retainAll(List.of(5, 6, 7));
        System.out.println(numbers);  // [5, 6, 7]

        numbers.removeAll(List.of(6, 7));
        System.out.println(numbers);  // [5]

    }
}
