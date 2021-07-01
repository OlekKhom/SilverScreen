package pl.cinema.SilverScreen.Seat.model;

import pl.cinema.SilverScreen.Ticket.model.Ticket;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    private int numberSeat;
    private boolean vip;
    @OneToOne(cascade = CascadeType.ALL)
    private Ticket ticket;

    public Seat() {
    }

    public Seat(long id, int numberSeat, boolean vip) {
        this.id = id;
        this.numberSeat = numberSeat;
        this.vip = vip;
    }

    public Seat(long id, int numberSeat, boolean vip, Ticket ticket) {
        this.id = id;
        this.numberSeat = numberSeat;
        this.vip = vip;
        this.ticket = ticket;
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

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", numberSeat=" + numberSeat +
                ", vip=" + vip +
                ", ticket=" + ticket +
                '}';
    }

    public static SeatBuilder builder() {
        return new SeatBuilder();
    }

    public static final class SeatBuilder {
        private long id;
        private int numberSeat;
        private boolean vip;
        private Ticket ticket;

        private SeatBuilder() {
        }

        public SeatBuilder id(long id) {
            this.id = id;
            return this;
        }

        public SeatBuilder numberSeat(int numberSeat) {
            this.numberSeat = numberSeat;
            return this;
        }

        public SeatBuilder vip(boolean vip) {
            this.vip = vip;
            return this;
        }

        public SeatBuilder ticket(Ticket ticket) {
            this.ticket = ticket;
            return this;
        }

        public Seat build() {
            Seat seat = new Seat();
            seat.setId(id);
            seat.setNumberSeat(numberSeat);
            seat.setVip(vip);
            seat.setTicket(ticket);
            return seat;
        }
    }
}
