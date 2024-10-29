package lab10;

import java.time.LocalDate;

public class Film implements Filmable{
    private String title;
    private String director;
    private int year;

    public Film(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int getFilmYear(Film film) {
        return LocalDate.now().getYear() - getYear();
    }
}
