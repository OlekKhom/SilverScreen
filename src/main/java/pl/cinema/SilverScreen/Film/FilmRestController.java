package pl.cinema.SilverScreen.Film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Film.model.FilmHttpRequest;
import pl.cinema.SilverScreen.Film.model.FilmHttpResponse;

import java.util.List;

@RestController
public class FilmRestController {

    @Autowired
    FilmService filmService;

    @Autowired
    public FilmRestController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films/{id}")
    public FilmHttpResponse getFilm(@PathVariable long id) {
        return filmService.getFilm(id);
    }

    @GetMapping("/films")
    public List<FilmHttpResponse> getAllFilms() {
        return filmService.getAllFilms();
    }

    @PostMapping("/films")
    public String create(@RequestBody FilmHttpRequest request) {
        return filmService.create(request);
    }

    @PutMapping("/film/{id}")
    public String update(@PathVariable long id, @RequestBody FilmHttpRequest request) {
        return filmService.update(id, request);
    }
}

/*@PutMapping("/film")
    public String filmGet() {
        return "Terminator";
    }

    @PostMapping("/film/{name}")
    public String filmPost (@PathVariable String name, @RequestParam String mainActor, @RequestParam int releaseYear){
        return name + " " + mainActor + " " + releaseYear;
    }*/