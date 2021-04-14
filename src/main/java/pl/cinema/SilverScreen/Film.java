package pl.cinema.SilverScreen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String mainActor;
    private int releaseYear;
    private int timeFilmsMinute;

    public Film() {
    }

    public Film(long id, String name, String mainActor, int releaseYear, int timeFilmsMinute) {
        this.id = id;
        this.name = name;
        this.mainActor = mainActor;
        this.releaseYear = releaseYear;
        this.timeFilmsMinute = timeFilmsMinute;
    }

    public Film(long id) {
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
}
