package lab13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);
        long count = 0;
        for (int number : numbers) {
            if (number > 5) {
                count++;
            }
        }
        System.out.println(count);

        long count2 = numbers.stream()
                .filter(number -> number > 5)
                .count();

        long count3 = numbers.stream()
                .skip(4)
                .filter(number -> number > 5)
                .count();

        // Creating streams
        List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Stream<Integer> numbersStream = famousNumbers.stream();

        Set<String> usefulConcepts = Set.of("Java", "Kotlin", "Python");
        Stream<String> conceptsStream = usefulConcepts.stream();

        Stream<Double> doubleStream = Arrays.stream(new Double[]{1.01, 1d, 0.99, 1.02, 1d, 0.99});

        Stream<String> persons = Stream.of("Alex", "Bob", "Cleopatra");

        Stream<Integer> empty1 = Stream.of();
        Stream<Integer> empty2 = Stream.empty();

        Stream<Integer> resultStream = Stream.concat(empty1, empty2);

        // Example <map>
        List<String> companies = List.of("Google", "Amazon", "Samsung", "GOOGLE", "amazon", "Oracle");
        companies.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        List<Double> numbers1 = List.of(6.28, 5.42, 84.0, 26.0);
        List<Double> famousNumbers1 = numbers1.stream()
                .map(number -> number / 2)
                .toList();



    }
}
