package pl.cinema.SilverScreen.MoviesRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoom;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpRequest;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpResponse;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesRoomService {

    private final MoviesRoomRepository moviesRoomRepository;

    @Autowired
    public MoviesRoomService(MoviesRoomRepository moviesRoomRepository) {
        this.moviesRoomRepository = moviesRoomRepository;
    }

    public boolean existsByNumberRoom(int numberRoom) {
        if (moviesRoomRepository.existsByNumberRoom(numberRoom)) {
            return true;
        }
        return false;
    }

    public boolean deleteByNumberRoom(int numberRoom) {
        if (moviesRoomRepository.existsByNumberRoom(numberRoom)) {
            moviesRoomRepository.deleteByNumberRoom(numberRoom);
            return true;
        }
        return false;
    }

    public boolean findByNumberRoom(int numberRoom) {
        if (moviesRoomRepository.findByNumberRoom(numberRoom)) {
            return true;
        }
        return false;
    }

    public MoviesRoomHttpResponse getMoviesRoom(long id) {
        MoviesRoom moviesRoom = moviesRoomRepository.findById(id).get();
        MoviesRoomHttpResponse responseMoviesRoom = MoviesRoomMapper.map(moviesRoom);
        return responseMoviesRoom;
    }

    public List<MoviesRoomHttpResponse> getAllMoviesRooms() {
        Iterable<MoviesRoom> moviesRooms = moviesRoomRepository.findAll();
        List<MoviesRoomHttpResponse> responseMoviesRooms = new ArrayList<>();
        for (MoviesRoom moviesRoom : moviesRooms) {
            responseMoviesRooms.add(MoviesRoomMapper.map(moviesRoom));
        }
        return responseMoviesRooms;
    }

    public boolean delete(long id) {
        if (moviesRoomRepository.existsById(id)) {
            moviesRoomRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String create (MoviesRoomHttpRequest moviesRoom) {
        MoviesRoom moviesRoomEntity = MoviesRoomMapper.map(moviesRoom);
        MoviesRoom save = moviesRoomRepository.save(moviesRoomEntity);
        return String.valueOf(save.getId());
    }

    public String update (long id, MoviesRoomHttpRequest moviesRoom) {
        MoviesRoom moviesRoomEntity = MoviesRoomMapper.map(moviesRoom);
        moviesRoomEntity.setId(id);
        MoviesRoom save = moviesRoomRepository.save(moviesRoomEntity);
        return String.valueOf(save.getId());
    }
}
