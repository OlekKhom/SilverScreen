package pl.cinema.SilverScreen.Ticket.model;

import pl.cinema.SilverScreen.Client.model.Client;
import pl.cinema.SilverScreen.Client.model.ClientHttpResponse;

public class TicketHttpResponse {

    private long id;
    private int number;
    private double price;
    private ClientHttpResponse client;

    public TicketHttpResponse(long id, int number, double price) {
        this.id = id;
        this.number = number;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ClientHttpResponse getClient() {
        return client;
    }

    public void setClient(ClientHttpResponse client) {
        this.client = client;
    }

    public static final class TicketHttpResponseBuilder {
        private long id;
        private int number;
        private double price;
        private ClientHttpResponse client;

        private TicketHttpResponseBuilder() {
        }

        public static TicketHttpResponseBuilder builder() {
            return new TicketHttpResponseBuilder();
        }

        public TicketHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public TicketHttpResponseBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketHttpResponseBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketHttpResponseBuilder client(ClientHttpResponse client) {
            this.client = client;
            return this;
        }

        public TicketHttpResponse build() {
            TicketHttpResponse ticketHttpResponse = new TicketHttpResponse(id, number, price);
            ticketHttpResponse.setClient(client);
            return ticketHttpResponse;
        }
    }



    /*

    public static final class TicketHttpResponseBuilder {
        private long id;
        private int number;
        private double price;

        private TicketHttpResponseBuilder() {
        }

        public static TicketHttpResponseBuilder builder() {
            return new TicketHttpResponseBuilder();
        }

        public TicketHttpResponseBuilder id(long id) {
            this.id = id;
            return this;
        }

        public TicketHttpResponseBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketHttpResponseBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketHttpResponse build() {
            return new TicketHttpResponse(id, number, price);
        }
    }

     */
}
