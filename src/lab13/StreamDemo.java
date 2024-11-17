package lab13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Benefit of streams
        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);

        long count = 0;
        for (int number : numbers) {
            if (number > 5) {
                count++;
            }
        }
        System.out.println(count); // 5

        long count2 = numbers.stream()
                .filter(number -> number > 5)
                .count();


        // Creating streams
        // 1) from a collection
        List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Stream<Integer> numbersStream = famousNumbers.stream();

        Set<String> usefulConcepts = Set.of("Java", "Kotlin", "Python");
        Stream<String> conceptsStream = usefulConcepts.stream();

        // 2) from an array
        Stream<Double> doubleStream = Arrays.stream(new Double[]{1.01, 1d, 0.99, 1.02, 1d, 0.99});

        // 3) directly from some values
        Stream<String> persons = Stream.of("Alex", "Bob", "Cleopatra");

        // 4) concatenate other streams together
        Stream<Integer> empty1 = Stream.of();
        Stream<Integer> empty2 = Stream.empty();

        Stream<Integer> resultStream = Stream.concat(empty1, empty2);

        // Examples
        List<String> companies = List.of("Google", "Amazon", "Samsung", "GOOGLE", "amazon", "Oracle");
        companies.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        List<String> programmingLanguages = Arrays.asList("Java", "Python", "Scala", "Kotlin", "JavaScript");
        long count3 = programmingLanguages.stream()
                .filter(lang -> lang.startsWith("J"))
                .count(); // 2
    }
}

