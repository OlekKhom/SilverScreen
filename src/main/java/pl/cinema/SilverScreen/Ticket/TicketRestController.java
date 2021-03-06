package pl.cinema.SilverScreen.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpRequest;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;

import java.util.List;

@RestController
public class TicketRestController {

    @Autowired
    TicketService ticketService;

    @Autowired
    public TicketRestController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets/{id}")
    public TicketHttpResponse getTicket(@PathVariable long id) {
        return ticketService.getTicket(id);
    }

    @GetMapping("/tickets")
    public List<TicketHttpResponse> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping("/tickets")
    public String create(@RequestBody TicketHttpRequest request) {
        return ticketService.create(request);
    }

    @PutMapping("/ticket/{id}")
    public String update(@PathVariable long id, @RequestBody TicketHttpRequest request) {
        return ticketService.update(id, request);
    }
}



    /*

    @PostMapping("/ticket/{number}")
    public String ticketPost(@PathVariable int number, @RequestParam double price, @RequestParam int room ) {
        Ticket ticket = new Ticket(1, number, price);
        MoviesRoom mrg = new MoviesRoom(4, room, 15, "Beat2D");
        return "MoviesRoom: " + mrg.toString() + " and ticket: " + ticket.toString();

    }

     */
