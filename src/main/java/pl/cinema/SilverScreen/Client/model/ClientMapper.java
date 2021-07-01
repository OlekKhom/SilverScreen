package pl.cinema.SilverScreen.Client.model;

public class ClientMapper {

    public static ClientHttpResponse map(Client client) {
        return ClientHttpResponse.builder()
                .id(client.getId())
                .name(client.getName())
                .password(client.getPassword())
                .build();
    }

    public static Client map(ClientHttpRequest client) {
        return Client.builder()
                .name(client.getName())
                .password(client.getPassword())
                .build();
    }

}
