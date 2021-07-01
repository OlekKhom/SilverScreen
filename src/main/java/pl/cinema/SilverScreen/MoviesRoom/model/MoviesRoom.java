package pl.cinema.SilverScreen.MoviesRoom.model;

import pl.cinema.SilverScreen.Film.model.Film;
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
    private String soundType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ticket> tickets;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
         name = "films_playbill",
         joinColumns = @JoinColumn(name = "moviesRoom_id"),
         inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private Set<Film> filmsPlaybill = new HashSet<>();


    public MoviesRoom() {
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundType) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        this.soundType = soundType;
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundType, List<Ticket> tickets) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        this.soundType = soundType;
        this.tickets = tickets;
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundType, List<Ticket> tickets, Set<Film> filmsPlaybill) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        this.soundType = soundType;
        this.tickets = tickets;
        this.filmsPlaybill = filmsPlaybill;
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

    public String getSoundType() {
        return soundType;
    }

    public MoviesRoom setSoundType(String soundType) {
        this.soundType = soundType;
        return this;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Set<Film> getFilmsPlaybill() {
        return filmsPlaybill;
    }

    public void setFilmsPlaybill(Set<Film> filmsPlaybill) {
        this.filmsPlaybill = filmsPlaybill;
    }

    public void addFilmToPlaybill(Film film) {
        filmsPlaybill.add(film);
    }

    @Override
    public String toString() {
        return "MoviesRoom{" +
                "id=" + id +
                ", numberRoom=" + numberRoom +
                ", seats=" + seats +
                ", SoundTyp='" + soundType + '\'' +
                ", tickets=" + tickets +
                ", filmsPlaybill=" + filmsPlaybill +
                '}';
    }

    public static MoviesRoomBuilder builder() {
        return new MoviesRoomBuilder();
    }

    public static final class MoviesRoomBuilder {
        List<Ticket> tickets;
        private long id;
        private int numberRoom;
        private int seats;
        private String soundType;
        private Set<Film> filmsPlaybill = new HashSet<>();

        private MoviesRoomBuilder() {
        }

        public MoviesRoomBuilder id(long id) {
            this.id = id;
            return this;
        }

        public MoviesRoomBuilder numberRoom(int numberRoom) {
            this.numberRoom = numberRoom;
            return this;
        }

        public MoviesRoomBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public MoviesRoomBuilder soundType(String soundType) {
            this.soundType = soundType;
            return this;
        }

        public MoviesRoomBuilder tickets(List<Ticket> tickets) {
            this.tickets = tickets;
            return this;
        }

        public MoviesRoomBuilder filmsPlaybill(Set<Film> filmsPlaybill) {
            this.filmsPlaybill = filmsPlaybill;
            return this;
        }

        public MoviesRoom build() {
            MoviesRoom moviesRoom = new MoviesRoom();
            moviesRoom.setId(id);
            moviesRoom.setNumberRoom(numberRoom);
            moviesRoom.setSeats(seats);
            moviesRoom.setSoundType(soundType);
            moviesRoom.setTickets(tickets);
            moviesRoom.setFilmsPlaybill(filmsPlaybill);
            return moviesRoom;
        }
    }
}
