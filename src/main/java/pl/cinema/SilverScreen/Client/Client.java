package pl.cinema.SilverScreen.Client;

import pl.cinema.SilverScreen.Ticket.Ticket;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    private String name;
    private int password;
    @OneToMany
    List<Ticket> tickets;

    public Client() {
    }

    public Client(long id, String name, int password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Client(long id, String name, int password, List<Ticket> tickets) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tickets = tickets;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
