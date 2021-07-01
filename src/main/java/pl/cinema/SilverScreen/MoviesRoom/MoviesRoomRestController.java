package pl.cinema.SilverScreen.MoviesRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpRequest;
import pl.cinema.SilverScreen.MoviesRoom.model.MoviesRoomHttpResponse;

import java.util.List;

@RestController
public class MoviesRoomRestController {

    @Autowired
    MoviesRoomService moviesRoomService;

    @Autowired
    public MoviesRoomRestController(MoviesRoomService moviesRoomService) {
        this.moviesRoomService = moviesRoomService;
    }

    @GetMapping("/moviesRooms/{id}")
    public MoviesRoomHttpResponse getMoviesRoom(@PathVariable long id) {
        return moviesRoomService.getMoviesRoom(id);
    }

    @GetMapping("/moviesRooms")
    public List<MoviesRoomHttpResponse> getAllMoviesRooms() {
        return moviesRoomService.getAllMoviesRooms();
    }

    @PostMapping("/moviesRooms")
    public String create(@RequestBody MoviesRoomHttpRequest request) {
        return moviesRoomService.create(request);
    }

    @PutMapping("/moviesRoom/{id}")
    public String update(@PathVariable long id, @RequestBody MoviesRoomHttpRequest request) {
        return moviesRoomService.update(id, request);
    }
}

/*@Autowired
    FilmRepository filmRepository;

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

    //ManyToMany MoviesRoom-Film

    @PostMapping
    MoviesRoom createMoviesRoom(@RequestBody MoviesRoom moviesRoom) {
        return moviesRoomRepository.save(moviesRoom);
    }

    @PutMapping("/moviesRoom/{moviesRoomId}/film/{filmId}")
    MoviesRoom filmToMoviesRoom(@PathVariable long moviesRoomId, @PathVariable long filmId) {
        MoviesRoom moviesRoom = moviesRoomRepository.findById(moviesRoomId).get();
        Film film = filmRepository.findById(filmId).get();
        moviesRoom.addFilmToPlaybill(film);
        return moviesRoomRepository.save(moviesRoom);
    }*/