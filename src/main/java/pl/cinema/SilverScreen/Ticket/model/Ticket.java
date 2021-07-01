package pl.cinema.SilverScreen.Ticket.model;

import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Film.model.Film;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;
import pl.cinema.SilverScreen.Seat.model.Seat;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    private int number;
    private double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id")
    private Film film;
    @OneToOne(cascade = CascadeType.ALL)
    private Seat seat;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "moviesRoom_id")
    private MoviesRoom moviesRoom;

    public Ticket() {
    }

    public Ticket(long id, int number, double price) {
        this.id = id;
        this.number = number;
        this.price = price;
    }

    public Ticket(long id, int number, double price, Client client) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.client = client;
    }

    public Ticket(long id, int number, double price, Film film) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.film = film;
    }

    public Ticket(long id, int number, double price, Seat seat) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.seat = seat;
    }

    public Ticket(long id, int number, double price, Client client, Film film, Seat seat, MoviesRoom moviesRoom) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.client = client;
        this.film = film;
        this.seat = seat;
        this.moviesRoom = moviesRoom;
    }

    public long getId() {
        return id;
    }

    public Ticket setId(long id) {
        this.id = id;
        return this;
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

    public Client getClient() {
        return client;
    }

    public Ticket setClient(Client client) {
        this.client = client;
        return this;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public MoviesRoom getMoviesRoom() {
        return moviesRoom;
    }

    public void setMoviesRoom(MoviesRoom moviesRoom) {
        this.moviesRoom = moviesRoom;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", number=" + number +
                ", price=" + price +
                ", client=" + client +
                '}';
    }

    public static TicketBuilder builder() {
        return new TicketBuilder();
    }

    public static final class TicketBuilder {
        private long id;
        private int number;
        private double price;
        private Client client;
        private Film film;
        private Seat seat;
        private MoviesRoom moviesRoom;

        private TicketBuilder() {
        }

        public TicketBuilder id(long id) {
            this.id = id;
            return this;
        }

        public TicketBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketBuilder client(Client client) {
            this.client = client;
            return this;
        }

        public TicketBuilder film(Film film) {
            this.film = film;
            return this;
        }

        public TicketBuilder seat(Seat seat) {
            this.seat = seat;
            return this;
        }

        public TicketBuilder moviesRoom(MoviesRoom moviesRoom) {
            this.moviesRoom = moviesRoom;
            return this;
        }

        public Ticket build() {
            Ticket ticket = new Ticket();
            ticket.setId(id);
            ticket.setNumber(number);
            ticket.setPrice(price);
            ticket.setClient(client);
            ticket.setFilm(film);
            ticket.setSeat(seat);
            ticket.setMoviesRoom(moviesRoom);
            return ticket;
        }
    }
}
