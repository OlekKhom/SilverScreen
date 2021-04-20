package pl.cinema.SilverScreen.Film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmRestController {

    @Autowired
    FilmRepository filmRepository;

    @PutMapping("/film")
    public String filmGet() {
        return "Terminator";
    }

    @PostMapping("/film/{name}")
    public String filmPost (@PathVariable String name, @RequestParam String mainActor, @RequestParam int releaseYear){
        return name + " " + mainActor + " " + releaseYear;
    }
}