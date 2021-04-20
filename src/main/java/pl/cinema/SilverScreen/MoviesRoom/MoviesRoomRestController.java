package pl.cinema.SilverScreen.MoviesRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Client.Client;
import pl.cinema.SilverScreen.Client.ClientRepository;
import pl.cinema.SilverScreen.Film.FilmRepository;
import pl.cinema.SilverScreen.Ticket.Ticket;
import pl.cinema.SilverScreen.Ticket.TicketRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesRoomRestController {

    @Autowired
    MoviesRoomRepository moviesRoomRepository;

    @GetMapping("/moviesRoom/{id}")
    public String MoviesRoomGet(@PathVariable int id) {
        MoviesRoom mrg1 = new MoviesRoom(1, 1, 30, "Beat4D");
        MoviesRoom mrg2 = new MoviesRoom(2, 2, 15, "Beat2D");
        MoviesRoom mrg3 = new MoviesRoom(3, 3, 24, "Beat6D");
        List<MoviesRoom> mr3 = new ArrayList<>();
        mr3.add(mrg1);
        mr3.add(mrg2);
        mr3.add(mrg3);
        return mr3.get(id-1).toString();
    }

}