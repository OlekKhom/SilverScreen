package pl.cinema.SilverScreen.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public class ClientRestController {

    @Autowired
    ClientRepository clientRepository;

}
