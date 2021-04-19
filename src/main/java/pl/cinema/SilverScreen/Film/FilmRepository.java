package pl.cinema.SilverScreen.Film;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Film.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
}
