package pl.cinema.SilverScreen.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;
import pl.cinema.SilverScreen.Client.model.ClientMapper;


@RestController
public class ClientRestController {

    @Autowired
    ClientRepository clientRepository;

    /*

    @GetMapping("/client/{id}")
    public ClientHttpResponse getClient(@PathVariable long id) {
        Client client = clientRepository.findById(id).get();
        ClientHttpResponse response = ClientMapper.map(client);
        return response;
    }

     */

    /*

    @PutMapping("/client/{name}")
    public String clientDetails(@PathVariable String name, @RequestParam int password) {
        Client client1 = new Client(0, "Tom", 1234);
        if (client1.getName().equals(name) && client1.getPassword() == password) {
            return "Welcome " + name;
        } else {
            return "Wrong password or name";
        }
    }

    @GetMapping("/client/{name}")
    public String clientGetter(@PathVariable String name) {
        return name;
    }

     */
}
