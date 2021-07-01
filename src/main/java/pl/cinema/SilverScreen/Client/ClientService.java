package pl.cinema.SilverScreen.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.model.ClientHttpRequest;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;
import pl.cinema.SilverScreen.Client.model.ClientMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public boolean existsByName(String name) {
        if (clientRepository.existsByName(name)) {
            return true;
        }
        return false;
    }

    public boolean deleteByName(String name) {
        if (clientRepository.existsByName(name)) {
            clientRepository.deleteByName(name);
            return true;
        }
        return false;
    }

    public boolean findByName(String name) {
        if (clientRepository.findByName(name)) {
            return true;
        }
        return false;
    }

    public ClientHttpResponse getClient(long id) {
        Client client = clientRepository.findById(id).get();
        ClientHttpResponse responseClient = ClientMapper.map(client);
        return responseClient;
    }

    public List<ClientHttpResponse> getAllClients() {
        Iterable<Client> clients = clientRepository.findAll();
        List<ClientHttpResponse> responseClients = new ArrayList<>();
        for (Client client : clients) {
            responseClients.add(ClientMapper.map(client));
        }
        return responseClients;
    }

    public boolean delete(long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String create (ClientHttpRequest client) {
        Client clientEntity = ClientMapper.map(client);
        Client save = clientRepository.save(clientEntity);
        return String.valueOf(save.getId());
    }

    public String update (long id, ClientHttpRequest client) {
        Client clientEntity = ClientMapper.map(client);
        clientEntity.setId(id);
        Client save = clientRepository.save(clientEntity);
        return String.valueOf(save.getId());
    }
}
