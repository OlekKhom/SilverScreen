package pl.cinema.SilverScreen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int number;
    private double price;
    private Client client;

    public Ticket() {
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

    public Client getKlient() {
        return client;
    }

    public Ticket setKlient(Client client) {
        this.client = client;
        return this;
    }
}
