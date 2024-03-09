package lab13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmExample {
    public static void main(String[] args) {
        List <Film> films = new ArrayList<>();
        films.add(new Film("Oppenheimer", "Nolan", 2023));
        films.add(new Film("Inception", "Nolan", 2010));
        films.add(new Film("The Dark Knight", "Nolan", 2023));
        films.add(new Film("The Wolf of Wall Street", "Scorsese", 2013));
        films.add(new Film("Shutter Island", "Scorsese", 2010));
        films.add(new Film("Gangs of New York", "Scorsese", 2002));
        films.add(new Film("Inglorious Basterds", "Tarantino", 2009));
        films.add(new Film("Django Unchained", "Tarantino", 2012));
        films.add(new Film("The Hateful Eight", "Tarantino", 2015));

        List<String> filmTitles = films.stream()
                .map(Film::getTitle)
                .toList();
    }
}
