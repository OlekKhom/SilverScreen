package pl.cinema.SilverScreen.MoviesRoom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MoviesRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numberRoom;
    private int seats;
    private String SoundTyp;

    public MoviesRoom() {
    }

    public MoviesRoom(long id, int numberRoom, int seats, String soundTyp) {
        this.id = id;
        this.numberRoom = numberRoom;
        this.seats = seats;
        SoundTyp = soundTyp;
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
}
