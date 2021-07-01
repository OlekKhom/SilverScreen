package pl.cinema.SilverScreen.Film;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Film.model.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {

    boolean existsByName(String name);
    boolean deleteByName(String name);
    boolean findByName(String name);
}
