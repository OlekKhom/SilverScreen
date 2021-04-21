package pl.cinema.SilverScreen.Ticket;

import pl.cinema.SilverScreen.Client.Client;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    private int number;
    private double price;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

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

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", number=" + number +
                ", price=" + price +
                ", client=" + client +
                '}';
    }
}
