package pl.cinema.SilverScreen.Seat.model;

import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;

public class SeatHttpResponse {

    private long id;
    private int numberSeat;
    private boolean vip;
    private TicketHttpResponse ticket;

    public SeatHttpResponse(long id, int numberSeat, boolean vip) {
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

    public TicketHttpResponse getTicket() {
        return ticket;
    }

    public void setTicket(TicketHttpResponse ticket) {
        this.ticket = ticket;
    }

    public static SeatHttpResponseBuilder builder() {
        return new SeatHttpResponseBuilder();
    }

    public static final class SeatHttpResponseBuilder {
        private long id;
        private int numberSeat;
        private boolean vip;
        private TicketHttpResponse ticket;

        private SeatHttpResponseBuilder() {
        }

        public SeatHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public SeatHttpResponseBuilder numberSeat(int numberSeat) {
            this.numberSeat = numberSeat;
            return this;
        }

        public SeatHttpResponseBuilder vip(boolean vip) {
            this.vip = vip;
            return this;
        }

        public SeatHttpResponseBuilder ticket(TicketHttpResponse ticket) {
            this.ticket = ticket;
            return this;
        }

        public SeatHttpResponse build() {
            SeatHttpResponse seatHttpResponse = new SeatHttpResponse(id, numberSeat, vip);
            seatHttpResponse.setTicket(ticket);
            return seatHttpResponse;
        }
    }
}
