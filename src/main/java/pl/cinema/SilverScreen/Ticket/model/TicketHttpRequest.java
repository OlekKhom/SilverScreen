package pl.cinema.SilverScreen.Ticket.model;


import pl.cinema.SilverScreen.Client.model.ClientHttpRequest;
import pl.cinema.SilverScreen.Film.model.FilmHttpRequest;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpRequest;
import pl.cinema.SilverScreen.Seat.model.SeatHttpRequest;

public class TicketHttpRequest {

    private int number;
    private double price;
    private ClientHttpRequest client;
    private FilmHttpRequest film;
    private SeatHttpRequest seat;
    private MoviesRoomHttpRequest moviesRoom;

    public TicketHttpRequest(int number, double price, ClientHttpRequest client, FilmHttpRequest film, SeatHttpRequest seat, MoviesRoomHttpRequest moviesRoom) {
        this.number = number;
        this.price = price;
        this.client = client;
        this.film = film;
        this.seat = seat;
        this.moviesRoom = moviesRoom;
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

    public ClientHttpRequest getClient() {
        return client;
    }

    public void setClient(ClientHttpRequest client) {
        this.client = client;
    }

    public FilmHttpRequest getFilm() {
        return film;
    }

    public void setFilm(FilmHttpRequest film) {
        this.film = film;
    }

    public SeatHttpRequest getSeat() {
        return seat;
    }

    public void setSeat(SeatHttpRequest seat) {
        this.seat = seat;
    }

    public MoviesRoomHttpRequest getMoviesRoom() {
        return moviesRoom;
    }

    public void setMoviesRoom(MoviesRoomHttpRequest moviesRoom) {
        this.moviesRoom = moviesRoom;
    }

    public static TicketHttpRequestBuilder builder() {
        return new TicketHttpRequestBuilder();
    }

    public static final class TicketHttpRequestBuilder {
        private int number;
        private double price;
        private ClientHttpRequest client;
        private FilmHttpRequest film;
        private SeatHttpRequest seat;
        private MoviesRoomHttpRequest moviesRoom;

        private TicketHttpRequestBuilder() {
        }

        public TicketHttpRequestBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketHttpRequestBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketHttpRequestBuilder client(ClientHttpRequest client) {
            this.client = client;
            return this;
        }

        public TicketHttpRequestBuilder film(FilmHttpRequest film) {
            this.film = film;
            return this;
        }

        public TicketHttpRequestBuilder seat(SeatHttpRequest seat) {
            this.seat = seat;
            return this;
        }

        public TicketHttpRequestBuilder moviesRoom(MoviesRoomHttpRequest moviesRoom) {
            this.moviesRoom = moviesRoom;
            return this;
        }

        public TicketHttpRequest build() {
            return new TicketHttpRequest(number, price, client, film, seat, moviesRoom);
        }
    }
}
