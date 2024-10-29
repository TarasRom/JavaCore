package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemo {

    public static List<Integer> getFilmsOfYear(List<Film> films, Filmable filmable) {
        List<Integer> filmsYear = new ArrayList<>();
        for (Film element : films) {
            int year = filmable.getFilmYear(element);
            filmsYear.add(year);
        }
        return filmsYear;
    }

    public static List<Film> getListOfFilms(List<Film> films, Predicate<Film> predicate) {
        List<Film> film = new ArrayList<>();
        for (Film element : films) {
            if (predicate.test(element)) {
                film.add(element);
            }
        }
        return film;
    }

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("Oppenheimer", "Nolan", 2023));
        films.add(new Film("Inception", "Nolan", 2010));
        films.add(new Film("The Wolf of Wall Street", "Scorsese", 2013));
        films.add(new Film("Shutter Island", "Scorsese", 2010));
        films.add(new Film("The Hateful Eight", "Tarantino", 2015));
        films.add(new Film("Inglorious Basterds", "Tarantino", 2009));

        Filmable filmable = film -> film.getYear();
        System.out.println(getFilmsOfYear(films, filmable));

        Predicate<Film> predicate = film -> film.getYear() > 2014;
        System.out.println(getListOfFilms(films, predicate));

    }
}
