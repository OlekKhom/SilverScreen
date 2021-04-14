package pl.cinema.SilverScreen;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRoomRepository extends CrudRepository<MoviesRoom, Long> {
}
