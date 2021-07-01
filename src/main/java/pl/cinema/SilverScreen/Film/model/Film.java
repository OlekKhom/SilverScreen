package pl.cinema.SilverScreen.Film.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;
import pl.cinema.SilverScreen.Ticket.model.Ticket;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String mainActor;
    private int releaseYear;
    private int timeFilmsMinute;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ticket> tickets;
    @JsonIgnore
    @ManyToMany(mappedBy = "filmsPlaybill", cascade = CascadeType.ALL)
    private Set<MoviesRoom> moviesRooms = new HashSet<>();

    public Film() {
    }

    public Film(long id, String name, String mainActor, int releaseYear, int timeFilmsMinute) {
        this.id = id;
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
    }

    public Film(long id, String name, String mainActor, int releaseYear, int timeFilmsMinute, List<Ticket> tickets) {
        this.id = id;
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
        this.tickets = tickets;
    }

    public Film(long id, String name, String mainActor, int releaseYear, int timeFilmsMinute, List<Ticket> tickets, Set<MoviesRoom> moviesRooms) {
        this.id = id;
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
        this.tickets = tickets;
        this.moviesRooms = moviesRooms;
    }

    public Film(long id) {
        this.id = id;
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

    public Film setName(String name) {
        this.name = name;
        return this;
    }

    public String getMainActor() {
        return mainActor;
    }

    public Film setMainActor(String mainActor) {
        this.mainActor = mainActor;
        return this;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Film setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public int getTimeFilmsMinute() {
        return timeFilmsMinute;
    }

    public Film setTimeFilmsMinute(int timeFilmsMinute) {
        this.timeFilmsMinute = timeFilmsMinute;
        return this;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Set<MoviesRoom> getMoviesRooms() {
        return moviesRooms;
    }

    public void setMoviesRooms(Set<MoviesRoom> moviesRooms) {
        this.moviesRooms = moviesRooms;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mainActor='" + mainActor + '\'' +
                ", releaseYear=" + releaseYear +
                ", timeFilmsMinute=" + timeFilmsMinute +
                ", tickets=" + tickets +
                ", moviesRooms=" + moviesRooms +
                '}';
    }

    public static FilmBuilder builder() {
        return new FilmBuilder();
    }

    public static final class FilmBuilder {
        List<Ticket> tickets;
        private long id;
        private String name;
        private String mainActor;
        private int releaseYear;
        private int timeFilmsMinute;
        private Set<MoviesRoom> moviesRooms = new HashSet<>();

        private FilmBuilder() {
        }

        public FilmBuilder id(long id) {
            this.id = id;
            return this;
        }

        public FilmBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FilmBuilder mainActor(String mainActor) {
            this.mainActor = mainActor;
            return this;
        }

        public FilmBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public FilmBuilder timeFilmsMinute(int timeFilmsMinute) {
            this.timeFilmsMinute = timeFilmsMinute;
            return this;
        }

        public FilmBuilder tickets(List<Ticket> tickets) {
            this.tickets = tickets;
            return this;
        }

        public FilmBuilder moviesRooms(Set<MoviesRoom> moviesRooms) {
            this.moviesRooms = moviesRooms;
            return this;
        }

        public Film build() {
            Film film = new Film();
            film.setId(id);
            film.setName(name);
            film.setMainActor(mainActor);
            film.setReleaseYear(releaseYear);
            film.setTimeFilmsMinute(timeFilmsMinute);
            film.setTickets(tickets);
            film.setMoviesRooms(moviesRooms);
            return film;
        }
    }
}
