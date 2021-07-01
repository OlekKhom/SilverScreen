package pl.cinema.SilverScreen.Client.model;

import pl.cinema.SilverScreen.Ticket.model.Ticket;

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
    @OneToMany(cascade = CascadeType.ALL)
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", tickets=" + tickets +
                '}';
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

    public static final class ClientBuilder {
        List<Ticket> tickets;
        private long id;
        private String name;
        private int password;

        private ClientBuilder() {
        }

        public ClientBuilder id(long id) {
            this.id = id;
            return this;
        }

        public ClientBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClientBuilder password(int password) {
            this.password = password;
            return this;
        }

        public ClientBuilder tickets(List<Ticket> tickets) {
            this.tickets = tickets;
            return this;
        }

        public Client build() {
            Client client = new Client();
            client.setId(id);
            client.setName(name);
            client.setPassword(password);
            client.setTickets(tickets);
            return client;
        }
    }
}
