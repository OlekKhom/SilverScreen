package pl.cinema.SilverScreen.MoviesRoom;

import pl.cinema.SilverScreen.Film.Film;
import pl.cinema.SilverScreen.Ticket.model.Ticket;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class MoviesRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numberRoom;
    private int seats;
    private String SoundTyp;
    @OneToMany
    List<Ticket> tickets;
    //+
    @ManyToMany
    @JoinTable(
         name = "films_playbill",
         joinColumns = @JoinColumn(name = "moviesRoom_id"),
         inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private Set<Film> filmsPlaybill = new HashSet<>();


    public MoviesRoom() {
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundTyp) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        SoundTyp = soundTyp;
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundTyp, List<Ticket> tickets) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        SoundTyp = soundTyp;
        this.tickets = tickets;
    }

    public long getId() {
        return id;
    }

    public MoviesRoom setId(long id) {
        this.id = id;
        return this;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public MoviesRoom setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public MoviesRoom setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public String getSoundTyp() {
        return SoundTyp;
    }

    public MoviesRoom setSoundTyp(String soundTyp) {
        SoundTyp = soundTyp;
        return this;
    }

    //+

    public void addFilmToPlaybill(Film film) {
        filmsPlaybill.add(film);
    }

    @Override
    public String toString() {
        return "MoviesRoom{" +
                "id=" + id +
                ", numberRoom=" + numberRoom +
                ", seats=" + seats +
                ", SoundTyp='" + SoundTyp + '\'' +
                '}';
    }
}
