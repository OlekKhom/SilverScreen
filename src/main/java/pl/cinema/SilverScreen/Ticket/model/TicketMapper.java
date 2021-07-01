package pl.cinema.SilverScreen.Ticket.model;

import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;
import pl.cinema.SilverScreen.Film.model.Film;
import pl.cinema.SilverScreen.Film.model.FilmHttpResponse;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpResponse;
import pl.cinema.SilverScreen.Seat.model.Seat;
import pl.cinema.SilverScreen.Seat.model.SeatHttpResponse;

public class TicketMapper {

    public static TicketHttpResponse map(Ticket ticket) {
        return TicketHttpResponse.builder()
                .id(ticket.getId())
                .number(ticket.getNumber())
                .price(ticket.getPrice())
                .client(ClientHttpResponse.builder()
                        .id(ticket.getClient().getId())
                        .name(ticket.getClient().getName())
                        .password(ticket.getClient().getPassword())
                         .build())
                .film(FilmHttpResponse.builder()
                         .id(ticket.getFilm().getId())
                         .name(ticket.getFilm().getName())
                         .mainActor(ticket.getFilm().getMainActor())
                         .releaseYear(ticket.getFilm().getReleaseYear())
                         .timeFilmsMinute(ticket.getFilm().getTimeFilmsMinute())
                         .build())
                .seat(SeatHttpResponse.builder()
                         .id(ticket.getSeat().getId())
                         .numberSeat(ticket.getSeat().getNumberSeat())
                         .vip(ticket.getSeat().isVip())
                         .build())
                .moviesRoom(MoviesRoomHttpResponse.builder()
                        .id(ticket.getMoviesRoom().getId())
                        .numberRoom(ticket.getMoviesRoom().getNumberRoom())
                        .seats(ticket.getMoviesRoom().getSeats())
                        .soundType(ticket.getMoviesRoom().getSoundType())
                        .build())
                .build();
    }

    public static Ticket map(TicketHttpRequest ticket) {
        return Ticket.builder()
                .number(ticket.getNumber())
                .price(ticket.getPrice())
                .client(new Client(0, ticket.getClient().getName(), ticket.getClient().getPassword()))
                .film(new Film(0, ticket.getFilm().getName(), ticket.getFilm().getMainActor(), ticket.getFilm().getReleaseYear(), ticket.getFilm().getTimeFilmsMinute()))
                .seat(new Seat(0, ticket.getSeat().getNumberSeat(), ticket.getSeat().isVip()))
                .moviesRoom(new MoviesRoom(0, ticket.getMoviesRoom().getNumberRoom(), ticket.getMoviesRoom().getSeats(), ticket.getMoviesRoom().getSoundType()))
                .build();
    }
}
