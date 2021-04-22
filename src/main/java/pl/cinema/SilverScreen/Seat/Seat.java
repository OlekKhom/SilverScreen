package pl.cinema.SilverScreen.Seat;

import pl.cinema.SilverScreen.Ticket.Ticket;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    private int numberSeat;
    private boolean vip;
    @OneToOne
    private Ticket ticket;

    public Seat() {
    }

    public Seat(long id, int numberSeat, boolean vip) {
        this.id = id;
        this.numberSeat = numberSeat;
        this.vip = vip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
