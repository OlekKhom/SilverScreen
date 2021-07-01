package pl.cinema.SilverScreen.MoviesRoom;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;

@Repository
public interface MoviesRoomRepository extends CrudRepository<MoviesRoom, Long> {

    boolean existsByNumberRoom(int numberRoom);
    boolean deleteByNumberRoom(int numberRoom);
    boolean findByNumberRoom(int numberRoom);
}
