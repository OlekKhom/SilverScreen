package pl.cinema.SilverScreen;

import javax.persistence.Embeddable;

@Embeddable
public class Client {
    private String name;
    private int password;

    public Client() {
    }

    public Client(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public int getPassword() {
        return password;
    }

    public Client setPassword(int password) {
        this.password = password;
        return this;
    }
}
