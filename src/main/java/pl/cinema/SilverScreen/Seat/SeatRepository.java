package pl.cinema.SilverScreen.Seat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.MoviesRoom.MoviesRoom;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {
}
