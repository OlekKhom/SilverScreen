package pl.cinema.SilverScreen.Ticket;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Ticket.model.Ticket;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long>{

    boolean existsByNumber(int number);
    boolean deleteByNumber(int number);
    boolean findByNumber(int number);
}