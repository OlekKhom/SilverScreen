package pl.cinema.SilverScreen.Ticket;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Ticket.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long>{
}