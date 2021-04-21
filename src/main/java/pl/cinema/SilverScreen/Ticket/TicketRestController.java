package pl.cinema.SilverScreen.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoom;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoomRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketRestController {

    @Autowired
    TicketRepository ticketRepository;

    @PostMapping("/ticket/{number}")
    public String ticketPost(@PathVariable int number, @RequestParam double price, @RequestParam int room ) {
        Ticket ticket = new Ticket(1, number, price);
        MoviesRoom mrg = new MoviesRoom(4, room, 15, "Beat2D");
        return "MoviesRoom: " + mrg.toString() + " and ticket: " + ticket.toString();

    }
}
