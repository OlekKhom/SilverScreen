package pl.cinema.SilverScreen.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ClientRestController {

    @Autowired
    ClientRepository clientRepository;

    @PutMapping("/client/{name}")
    public String clientDetails(@PathVariable String name, @RequestParam int password) {
        return "Name: " + name + ". Password: " + password + ".";
    }
    @GetMapping("/client/{name}")
    public String clientGetter(@PathVariable String name) {
        return name;
    }
}
