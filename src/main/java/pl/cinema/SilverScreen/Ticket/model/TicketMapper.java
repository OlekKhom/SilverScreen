package pl.cinema.SilverScreen.Ticket.model;

import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;

public class TicketMapper {

    public static TicketHttpResponse map(Ticket ticket) {
        return TicketHttpResponse.TicketHttpResponseBuilder.builder()
                .id(ticket.getId())
                .number(ticket.getNumber())
                .price(ticket.getPrice())
                .client(ClientHttpResponse.builder()
                    .id(ticket.getClient().getId())
                    .name(ticket.getClient().getName())
                        .password(ticket.getClient().getPassword())
                        .build())
                .build();
    }

    public static Ticket map(TicketHttpRequest ticket) {
        return Ticket.builder()
                .number(ticket.getNumber())
                .price(ticket.getPrice())
                .client(new Client(0, ticket.getClient().getName(), ticket.getClient().getPassword()))
                .build();


    }
}
