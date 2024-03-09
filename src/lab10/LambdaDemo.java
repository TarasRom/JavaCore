package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static List<Integer> getFilmsOfYear(List<Film> films, Filmable filmable) {
        List<Integer> filmsYear = new ArrayList<>();
        for (Film el : films) {
            int year = filmable.getFilmYear(el);
            filmsYear.add(year);
        }
        return filmsYear;
    }

    public static List<Film> getListOfFilms(List<Film> films, Predicate<Film> predicate) {
        List<Film> film = new ArrayList<>();
        for (Film el : films) {
            if (predicate.test(el)) {
                film.add(el);
            }
        }
        return film;
    }

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Shaushenk", 1994));
        films.add(new Film("GodFather", 1972));
        films.add(new Film("Die Hard", 1988));
        System.out.println(films);

        Filmable filmable = film -> 2023 - film.getYear();
        System.out.println(getFilmsOfYear(films, filmable));

        Predicate<Film> predicate = film -> film.getYear() > 1990;
        System.out.println(getListOfFilms(films, film -> film.getName().startsWith("D")));

    }
}
