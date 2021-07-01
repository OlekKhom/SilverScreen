package pl.cinema.SilverScreen.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.cinema.SilverScreen.Client.model.ClientHttpRequest;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;

import java.util.List;


@RestController
public class ClientRestController {

    @Autowired
    ClientService clientService;

    @Autowired
    public ClientRestController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients/{id}")
    public ClientHttpResponse getClient(@PathVariable long id) {
        return clientService.getClient(id);
    }

    @GetMapping("/clients")
    public List<ClientHttpResponse> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/clients")
    public String create(@RequestBody ClientHttpRequest request) {
        return clientService.create(request);
    }

    @PutMapping("/client/{id}")
    public String update(@PathVariable long id, @RequestBody ClientHttpRequest request) {
        return clientService.update(id, request);
    }
}


    /*@GetMapping("/client/{id}")
    public ClientHttpResponse getClient(@PathVariable long id) {
        Client client = clientRepository.findById(id).get();
        ClientHttpResponse response = ClientMapper.map(client);
        return response;
    }



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
