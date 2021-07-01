package pl.cinema.SilverScreen.Client.model;

import pl.cinema.SilverScreen.Ticket.model.TicketHttpResponse;


public class ClientHttpResponse {

    private long id;
    private String name;
    private int password;
    private TicketHttpResponse ticket;

    public ClientHttpResponse(long id, String name, int password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public TicketHttpResponse getTicket() {
        return ticket;
    }

    public void setTicket(TicketHttpResponse ticket) {
        this.ticket = ticket;
    }

    public static ClientHttpResponseBuilder builder() {
        return new ClientHttpResponseBuilder();
    }

    public static final class ClientHttpResponseBuilder {
        private long id;
        private String name;
        private int password;
        private TicketHttpResponse ticket;

        private ClientHttpResponseBuilder() {
        }

        public ClientHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public ClientHttpResponseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClientHttpResponseBuilder password(int password) {
            this.password = password;
            return this;
        }

        public ClientHttpResponseBuilder ticket(TicketHttpResponse ticket) {
            this.ticket = ticket;
            return this;
        }

        public ClientHttpResponse build() {
            ClientHttpResponse clientHttpResponse = new ClientHttpResponse(id, name, password);
            clientHttpResponse.setTicket(ticket);
            return clientHttpResponse;
        }
    }
}
