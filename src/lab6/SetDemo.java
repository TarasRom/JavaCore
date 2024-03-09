package lab6;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Monday");
        set1.add("Tuesday");
        set1.add("Wednesday");
        set1.add("Thursday");
        set1.add("Friday");
        System.out.println(set1);




//        SortedSet<Integer> sortedSet = new TreeSet<>();
//        sortedSet.add(21);
//        sortedSet.add(15);
//        sortedSet.add(13);
//        sortedSet.add(17);
//        sortedSet.add(10);
//        System.out.println(sortedSet);
//
//        System.out.println(sortedSet.headSet(15));
//        System.out.println(sortedSet.tailSet(15));
//
//        System.out.println(sortedSet.subSet(13,17));
//        System.out.println(sortedSet.first());
//        System.out.println(sortedSet.last());



        Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4, 5));

        numbers.addAll(Set.of(3, 4, 5, 6, 7));
        System.out.println(numbers);

        numbers.retainAll(List.of(5, 6, 7));
        System.out.println(numbers);

        numbers.removeAll(List.of(5, 6));
        System.out.println(numbers);

    }
}