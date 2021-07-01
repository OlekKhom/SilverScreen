package pl.cinema.SilverScreen.MoviesRoom.model;

import pl.cinema.SilverScreen.Film.model.FilmHttpRequest;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpRequest;


public class MoviesRoomHttpRequest {

    private int numberRoom;
    private int seats;
    private String soundType;
    private TicketHttpRequest tickets;
    private FilmHttpRequest filmsPlaybill;

    public MoviesRoomHttpRequest(int numberRoom, int seats, String soundType, TicketHttpRequest tickets, FilmHttpRequest filmsPlaybill) {
        this.numberRoom = numberRoom;
        this.seats = seats;
        soundType = soundType;
        this.tickets = tickets;
        this.filmsPlaybill = filmsPlaybill;
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

    public TicketHttpRequest getTickets() {
        return tickets;
    }

    public void setTickets(TicketHttpRequest tickets) {
        this.tickets = tickets;
    }

    public FilmHttpRequest getFilmsPlaybill() {
        return filmsPlaybill;
    }

    public void setFilmsPlaybill(FilmHttpRequest filmsPlaybill) {
        this.filmsPlaybill = filmsPlaybill;
    }


    public static final class MoviesRoomHttpRequestBuilder {
        private int numberRoom;
        private int seats;
        private String soundType;
        private TicketHttpRequest tickets;
        private FilmHttpRequest filmsPlaybill;

        private MoviesRoomHttpRequestBuilder() {
        }

        public static MoviesRoomHttpRequestBuilder aMoviesRoomHttpRequest() {
            return new MoviesRoomHttpRequestBuilder();
        }

        public MoviesRoomHttpRequestBuilder numberRoom(int numberRoom) {
            this.numberRoom = numberRoom;
            return this;
        }

        public MoviesRoomHttpRequestBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public MoviesRoomHttpRequestBuilder soundType(String soundType) {
            this.soundType = soundType;
            return this;
        }

        public MoviesRoomHttpRequestBuilder tickets(TicketHttpRequest tickets) {
            this.tickets = tickets;
            return this;
        }

        public MoviesRoomHttpRequestBuilder filmsPlaybill(FilmHttpRequest filmsPlaybill) {
            this.filmsPlaybill = filmsPlaybill;
            return this;
        }

        public MoviesRoomHttpRequest build() {
            return new MoviesRoomHttpRequest(numberRoom, seats, soundType, tickets, filmsPlaybill);
        }
    }
}
