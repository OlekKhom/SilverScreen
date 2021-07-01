package pl.cinema.SilverScreen.Film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cinema.SilverScreen.Film.model.Film;
import pl.cinema.SilverScreen.Film.model.FilmHttpRequest;
import pl.cinema.SilverScreen.Film.model.FilmHttpResponse;
import pl.cinema.SilverScreen.Film.model.FilmMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public boolean existsByName(String name) {
        if (filmRepository.existsByName(name)) {
            return true;
        }
        return false;
    }

    public boolean deleteByName(String name) {
        if (filmRepository.existsByName(name)) {
            filmRepository.deleteByName(name);
            return true;
        }
        return false;
    }

    public boolean findByName(String name) {
        if (filmRepository.findByName(name)) {
            return true;
        }
        return false;
    }

    public FilmHttpResponse getFilm(long id) {
        Film film = filmRepository.findById(id).get();
        FilmHttpResponse responseFilm = FilmMapper.map(film);
        return responseFilm;
    }

    public List<FilmHttpResponse> getAllFilms() {
        Iterable<Film> films = filmRepository.findAll();
        List<FilmHttpResponse> responseFilms = new ArrayList<>();
        for (Film film : films) {
            responseFilms.add(FilmMapper.map(film));
        }
        return responseFilms;
    }

    public boolean delete(long id) {
        if (filmRepository.existsById(id)) {
            filmRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String create (FilmHttpRequest film) {
        Film filmEntity = FilmMapper.map(film);
        Film save = filmRepository.save(filmEntity);
        return String.valueOf(save.getId());
    }

    public String update (long id, FilmHttpRequest film) {
        Film filmEntity = FilmMapper.map(film);
        filmEntity.setId(id);
        Film save = filmRepository.save(filmEntity);
        return String.valueOf(save.getId());
    }
}
