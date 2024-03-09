package lab10;

public class Film implements Filmable{
    private String name;
    private int year;

    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int getFilmYear(Film film) {
        return 2023 - film.getYear();
    }
}

