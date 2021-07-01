package pl.cinema.SilverScreen.Ticket.model;

import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;
import pl.cinema.SilverScreen.Film.model.FilmHttpResponse;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpResponse;
import pl.cinema.SilverScreen.Seat.model.SeatHttpResponse;

public class TicketHttpResponse {

    private long id;
    private int number;
    private double price;
    private ClientHttpResponse client;
    private FilmHttpResponse film;
    private SeatHttpResponse seat;
    private MoviesRoomHttpResponse moviesRoom;

    public TicketHttpResponse(long id, int number, double price) {
        this.id = id;
        this.number = number;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ClientHttpResponse getClient() {
        return client;
    }

    public void setClient(ClientHttpResponse client) {
        this.client = client;
    }

    public FilmHttpResponse getFilm() {
        return film;
    }

    public void setFilm(FilmHttpResponse film) {
        this.film = film;
    }

    public SeatHttpResponse getSeat() {
        return seat;
    }

    public void setSeat(SeatHttpResponse seat) {
        this.seat = seat;
    }

    public MoviesRoomHttpResponse getMoviesRoom() {
        return moviesRoom;
    }

    public void setMoviesRoom(MoviesRoomHttpResponse moviesRoom) {
        this.moviesRoom = moviesRoom;
    }

    public static TicketHttpResponseBuilder builder() {
        return new TicketHttpResponseBuilder();
    }

    public static final class TicketHttpResponseBuilder {
        private long id;
        private int number;
        private double price;
        private ClientHttpResponse client;
        private FilmHttpResponse film;
        private SeatHttpResponse seat;
        private MoviesRoomHttpResponse moviesRoom;

        private TicketHttpResponseBuilder() {
        }

        public TicketHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public TicketHttpResponseBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketHttpResponseBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketHttpResponseBuilder client(ClientHttpResponse client) {
            this.client = client;
            return this;
        }

        public TicketHttpResponseBuilder film(FilmHttpResponse film) {
            this.film = film;
            return this;
        }

        public TicketHttpResponseBuilder seat(SeatHttpResponse seat) {
            this.seat = seat;
            return this;
        }

        public TicketHttpResponseBuilder moviesRoom(MoviesRoomHttpResponse moviesRoom) {
            this.moviesRoom = moviesRoom;
            return this;
        }

        public TicketHttpResponse build() {
            TicketHttpResponse ticketHttpResponse = new TicketHttpResponse(id, number, price);
            ticketHttpResponse.setClient(client);
            ticketHttpResponse.setFilm(film);
            ticketHttpResponse.setSeat(seat);
            ticketHttpResponse.setMoviesRoom(moviesRoom);
            return ticketHttpResponse;
        }
    }
}
