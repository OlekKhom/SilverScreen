package pl.cinema.SilverScreen.MoviesRoom.model;

import pl.cinema.SilverScreen.Film.model.FilmHttpResponse;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;

public class MoviesRoomHttpResponse {

    private long id;
    private int numberRoom;
    private int seats;
    private String soundType;
    private TicketHttpResponse tickets;
    private FilmHttpResponse filmsPlaybill;

    public MoviesRoomHttpResponse(long id, int numberRoom, int seats, String soundType) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        this.soundType = soundType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSoundType() {
        return soundType;
    }

    public void setSoundType(String soundType) {
        this.soundType = soundType;
    }

    public TicketHttpResponse getTickets() {
        return tickets;
    }

    public void setTickets(TicketHttpResponse tickets) {
        this.tickets = tickets;
    }

    public FilmHttpResponse getFilmsPlaybill() {
        return filmsPlaybill;
    }

    public void setFilmsPlaybill(FilmHttpResponse filmsPlaybill) {
        this.filmsPlaybill = filmsPlaybill;
    }

    public static MoviesRoomHttpResponseBuilder builder() {
        return new MoviesRoomHttpResponseBuilder();
    }

    public static final class MoviesRoomHttpResponseBuilder {
        private long id;
        private int numberRoom;
        private int seats;
        private String soundType;
        private TicketHttpResponse tickets;
        private FilmHttpResponse filmsPlaybill;

        private MoviesRoomHttpResponseBuilder() {
        }

        public MoviesRoomHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public MoviesRoomHttpResponseBuilder numberRoom(int numberRoom) {
            this.numberRoom = numberRoom;
            return this;
        }

        public MoviesRoomHttpResponseBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public MoviesRoomHttpResponseBuilder soundType(String soundType) {
            this.soundType = soundType;
            return this;
        }

        public MoviesRoomHttpResponseBuilder tickets(TicketHttpResponse tickets) {
            this.tickets = tickets;
            return this;
        }

        public MoviesRoomHttpResponseBuilder filmsPlaybill(FilmHttpResponse filmsPlaybill) {
            this.filmsPlaybill = filmsPlaybill;
            return this;
        }

        public MoviesRoomHttpResponse build() {
            MoviesRoomHttpResponse moviesRoomHttpResponse = new MoviesRoomHttpResponse(id, numberRoom, seats, soundType);
            moviesRoomHttpResponse.setTickets(tickets);
            moviesRoomHttpResponse.setFilmsPlaybill(filmsPlaybill);
            return moviesRoomHttpResponse;
        }
    }
}
