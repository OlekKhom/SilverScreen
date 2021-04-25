package pl.cinema.SilverScreen.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cinema.SilverScreen.Ticket.model.Ticket;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpRequest;
import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;
import pl.cinema.SilverScreen.Ticket.model.TicketMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public boolean existsByNumber(int number) {
        if (ticketRepository.existsByNumber(number)) {
            return true;
        }
        return false;
    }

    public boolean deleteByNumber(int number) {
        if (ticketRepository.existsByNumber(number)) {
            ticketRepository.deleteByNumber(number);
            return true;
        }
        return false;
    }

    public boolean findByNumber(int number) {
        if (ticketRepository.findByNumber(number)) {
            return true;
        }
        return false;
    }

    public long countAllByNumber(int number) {
        return ticketRepository.countAllByNumber(number);
    }

    public TicketHttpResponse getTicket(long id) {
        Ticket ticket = ticketRepository.findById(id).get();
        TicketHttpResponse responseTicket = TicketMapper.map(ticket);
        return responseTicket;
    }

    public List<TicketHttpResponse> getAllTickets() {
        Iterable<Ticket> tickets = ticketRepository.findAll();
        List<TicketHttpResponse> responseTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            responseTickets.add(TicketMapper.map(ticket));
        }
        return responseTickets;
    }

    public boolean delete(long id) {
        if (ticketRepository.existsById(id)) {
            ticketRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String create (TicketHttpRequest ticket) {
        Ticket ticketEntity = TicketMapper.map(ticket);
        Ticket save = ticketRepository.save(ticketEntity);
        return String.valueOf(save.getId());
    }

    public String update (long id, TicketHttpRequest ticket) {
        Ticket ticketEntity = TicketMapper.map(ticket);
        ticketEntity.setId(id);
        Ticket save = ticketRepository.save(ticketEntity);
        return String.valueOf(save.getId());
    }
}
