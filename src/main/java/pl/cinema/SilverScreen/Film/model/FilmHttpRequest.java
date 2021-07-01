package pl.cinema.SilverScreen.Film.model;

import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpRequest;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpRequest;

public class FilmHttpRequest {

    private String name;
    private String mainActor;
    private int releaseYear;
    private int timeFilmsMinute;
    private TicketHttpRequest tickets;
    private MoviesRoomHttpRequest moviesRooms;

    public FilmHttpRequest(String name, String mainActor, int releaseYear, int timeFilmsMinute, TicketHttpRequest tickets, MoviesRoomHttpRequest moviesRooms) {
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
        this.tickets = tickets;
        this.moviesRooms = moviesRooms;
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

    public TicketHttpRequest getTickets() {
        return tickets;
    }

    public void setTickets(TicketHttpRequest tickets) {
        this.tickets = tickets;
    }

    public MoviesRoomHttpRequest getMoviesRooms() {
        return moviesRooms;
    }

    public void setMoviesRooms(MoviesRoomHttpRequest moviesRooms) {
        this.moviesRooms = moviesRooms;
    }

    public static FilmHttpRequestBuilder builder() {
        return new FilmHttpRequestBuilder();
    }

    public static final class FilmHttpRequestBuilder {
        private String name;
        private String mainActor;
        private int releaseYear;
        private int timeFilmsMinute;
        private TicketHttpRequest tickets;
        private MoviesRoomHttpRequest moviesRooms;

        private FilmHttpRequestBuilder() {
        }

        public FilmHttpRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FilmHttpRequestBuilder mainActor(String mainActor) {
            this.mainActor = mainActor;
            return this;
        }

        public FilmHttpRequestBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public FilmHttpRequestBuilder timeFilmsMinute(int timeFilmsMinute) {
            this.timeFilmsMinute = timeFilmsMinute;
            return this;
        }

        public FilmHttpRequestBuilder tickets(TicketHttpRequest tickets) {
            this.tickets = tickets;
            return this;
        }

        public FilmHttpRequestBuilder moviesRooms(MoviesRoomHttpRequest moviesRooms) {
            this.moviesRooms = moviesRooms;
            return this;
        }

        public FilmHttpRequest build() {
            return new FilmHttpRequest(name, mainActor, releaseYear, timeFilmsMinute, tickets, moviesRooms);
        }
    }
}
