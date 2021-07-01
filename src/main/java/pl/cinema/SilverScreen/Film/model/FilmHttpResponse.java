package pl.cinema.SilverScreen.Film.model;

import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpResponse;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;

public class FilmHttpResponse {

    private long id;
    private String name;
    private String mainActor;
    private int releaseYear;
    private int timeFilmsMinute;
    private TicketHttpResponse tickets;
    private MoviesRoomHttpResponse moviesRooms;

    public FilmHttpResponse(long id, String name, String mainActor, int releaseYear, int timeFilmsMinute) {
        this.id = id;
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTimeFilmsMinute() {
        return timeFilmsMinute;
    }

    public void setTimeFilmsMinute(int timeFilmsMinute) {
        this.timeFilmsMinute = timeFilmsMinute;
    }

    public TicketHttpResponse getTickets() {
        return tickets;
    }

    public void setTickets(TicketHttpResponse tickets) {
        this.tickets = tickets;
    }

    public MoviesRoomHttpResponse getMoviesRooms() {
        return moviesRooms;
    }

    public void setMoviesRooms(MoviesRoomHttpResponse moviesRooms) {
        this.moviesRooms = moviesRooms;
    }

    public static FilmHttpResponseBuilder builder() {
        return new FilmHttpResponseBuilder();
    }

    public static final class FilmHttpResponseBuilder {
        private long id;
        private String name;
        private String mainActor;
        private int releaseYear;
        private int timeFilmsMinute;
        private TicketHttpResponse tickets;
        private MoviesRoomHttpResponse moviesRooms;

        private FilmHttpResponseBuilder() {
        }

        public FilmHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public FilmHttpResponseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FilmHttpResponseBuilder mainActor(String mainActor) {
            this.mainActor = mainActor;
            return this;
        }

        public FilmHttpResponseBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public FilmHttpResponseBuilder timeFilmsMinute(int timeFilmsMinute) {
            this.timeFilmsMinute = timeFilmsMinute;
            return this;
        }

        public FilmHttpResponseBuilder tickets(TicketHttpResponse tickets) {
            this.tickets = tickets;
            return this;
        }

        public FilmHttpResponseBuilder moviesRooms(MoviesRoomHttpResponse moviesRooms) {
            this.moviesRooms = moviesRooms;
            return this;
        }

        public FilmHttpResponse build() {
            FilmHttpResponse filmHttpResponse = new FilmHttpResponse(id, name, mainActor, releaseYear, timeFilmsMinute);
            filmHttpResponse.setTickets(tickets);
            filmHttpResponse.setMoviesRooms(moviesRooms);
            return filmHttpResponse;
        }
    }
}
