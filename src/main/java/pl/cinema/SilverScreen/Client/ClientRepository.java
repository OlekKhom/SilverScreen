package pl.cinema.SilverScreen.Client;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinema.SilverScreen.Client.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    boolean existsByName(String name);
    boolean deleteByName(String name);
    boolean findByName(String name);
}
