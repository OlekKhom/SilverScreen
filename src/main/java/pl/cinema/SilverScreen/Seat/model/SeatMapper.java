package pl.cinema.SilverScreen.Seat.model;

import pl.cinema.SilverScreen.Ticket.model.Ticket;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;

public class SeatMapper {

    public static SeatHttpResponse map(Seat seat) {
        return SeatHttpResponse.builder()
                .id(seat.getId())
                .numberSeat(seat.getNumberSeat())
                .vip(seat.isVip())
                .ticket(TicketHttpResponse.builder()
                        .id(seat.getTicket().getId())
                        .number(seat.getTicket().getNumber())
                        .price(seat.getTicket().getPrice())
                        .build())
                .build();
    }

    public static Seat map(SeatHttpRequest seat) {
        return Seat.builder()
                .numberSeat(seat.getNumberSeat())
                .vip(seat.isVip())
                .ticket(new Ticket(0, seat.getTicket().getNumber(), seat.getTicket().getPrice()))
                .build();
    }
}
