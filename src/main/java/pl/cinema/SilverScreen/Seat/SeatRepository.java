package pl.cinema.SilverScreen.Seat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Seat.model.Seat;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {

    boolean existsByNumberSeat(int numberSeat);
    boolean deleteByNumberSeat(int numberSeat);
    boolean findByNumberSeat(int numberSeat);
    long countAllByNumberSeat(int numberSeat);
}
