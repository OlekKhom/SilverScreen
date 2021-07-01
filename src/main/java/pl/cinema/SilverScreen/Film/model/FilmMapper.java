package pl.cinema.SilverScreen.Film.model;

public class FilmMapper {

    public static FilmHttpResponse map(Film film) {
        return FilmHttpResponse.builder()
                .id(film.getId())
                .name(film.getName())
                .mainActor(film.getMainActor())
                .releaseYear(film.getReleaseYear())
                .timeFilmsMinute(film.getTimeFilmsMinute())
                .build();
    }

    public static Film map(FilmHttpRequest film) {
        return Film.builder()
                .name(film.getName())
                .mainActor(film.getMainActor())
                .releaseYear(film.getReleaseYear())
                .timeFilmsMinute(film.getTimeFilmsMinute())
                .build();
    }
}
