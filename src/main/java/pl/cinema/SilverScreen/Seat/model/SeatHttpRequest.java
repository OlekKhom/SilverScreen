package pl.cinema.SilverScreen.Seat.model;

import pl.cinema.SilverScreen.Ticket.model.TicketHttpRequest;

public class SeatHttpRequest {

    private int numberSeat;
    private boolean vip;
    TicketHttpRequest ticket;

    public SeatHttpRequest(int numberSeat, boolean vip, TicketHttpRequest ticket) {
        this.numberSeat = numberSeat;
        this.vip = vip;
        this.ticket = ticket;
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

    public TicketHttpRequest getTicket() {
        return ticket;
    }

    public void setTicket(TicketHttpRequest ticket) {
        this.ticket = ticket;
    }

    public static SeatHttpRequestBuilder builder() {
        return new SeatHttpRequestBuilder();
    }

    public static final class SeatHttpRequestBuilder {
        TicketHttpRequest ticket;
        private int numberSeat;
        private boolean vip;

        private SeatHttpRequestBuilder() {
        }

        public SeatHttpRequestBuilder numberSeat(int numberSeat) {
            this.numberSeat = numberSeat;
            return this;
        }

        public SeatHttpRequestBuilder vip(boolean vip) {
            this.vip = vip;
            return this;
        }

        public SeatHttpRequestBuilder ticket(TicketHttpRequest ticket) {
            this.ticket = ticket;
            return this;
        }

        public SeatHttpRequest build() {
            return new SeatHttpRequest(numberSeat, vip, ticket);
        }
    }
}
