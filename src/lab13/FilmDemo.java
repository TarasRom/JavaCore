package lab13;

import java.util.*;
import java.util.stream.Collectors;

public class FilmDemo {
    public static void main(String[] args) {

        List<Film> films = new ArrayList<>();
        films.add(new Film("Oppenheimer", "Nolan", 2023));
        films.add(new Film("Inception", "Nolan", 2010));
        films.add(new Film("The Dark Knight", "Nolan", 2008));
        films.add(new Film("The Wolf of Wall Street", "Scorsese", 2013));
        films.add(new Film("Shutter Island", "Scorsese", 2010));
        films.add(new Film("Gangs of New York", "Scorsese", 2002));
        films.add(new Film("Inglorious Basterds", "Tarantino", 2009));
        films.add(new Film("Django Unchained", "Tarantino", 2012));
        films.add(new Film("The Hateful Eight", "Tarantino", 2015));

        // Map and filter method
        films.stream()
                .map(Film::getTitle)
                .forEach(System.out::println);

        films.stream()
                .map(Film::getYear)
                .sorted()
                .forEach(System.out::println);

        long numberOfDirectors = films.stream()
                .map(Film::getDirector)
                .distinct()
                .count();  // 3

        List<Film> list = films.stream()
                .filter(film -> film.getYear() > 2000)
                .filter(film -> film.getDirector().equals("Nolan"))
                .toList();

        // Stream pipelines
        List<String> list2 = films.stream()
                .filter(film -> film.getYear() > 2010)
                .map(Film::getTitle)
                .toList();

        long numberOfFilms =  films.stream()
                .map(Film::getDirector)
                .filter(s -> s.equals("Tarantino"))
                .count();

        int a = films.stream()
                .mapToInt(Film::getYear)
                .min()
                .getAsInt();  // 2002

        // Partitioning and Grouping collectors
        Map<Boolean, List<Film>> filmsByNolan = films.stream()
                .collect(Collectors.partitioningBy(film -> film.getDirector().equals("Nolan")));

        for (var entry : filmsByNolan.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        Map<String, List<Film>> filmsByDirector = films.stream()
                .collect(Collectors.groupingBy(Film::getDirector));

        for (var entry : filmsByDirector.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}

