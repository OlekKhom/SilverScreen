package pl.cinema.SilverScreen.Ticket.model;


import pl.cinema.SilverScreen.Client.model.ClientHttpRequest;

public class TicketHttpRequest {

    private int number;
    private double price;
    private ClientHttpRequest client;

    public TicketHttpRequest(int number, double price, ClientHttpRequest client) {
        this.number = number;
        this.price = price;
        this.client = client;
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

    public ClientHttpRequest getClient() {
        return client;
    }

    public void setClient(ClientHttpRequest client) {
        this.client = client;
    }

    public static TicketHttpRequestBuilder builder() {
        return new TicketHttpRequestBuilder();
    }

    public static final class TicketHttpRequestBuilder {
        private int number;
        private double price;
        private ClientHttpRequest client;

        private TicketHttpRequestBuilder() {
        }

        public TicketHttpRequestBuilder number(int number) {
            this.number = number;
            return this;
        }

        public TicketHttpRequestBuilder price(double price) {
            this.price = price;
            return this;
        }

        public TicketHttpRequestBuilder client(ClientHttpRequest client) {
            this.client = client;
            return this;
        }

        public TicketHttpRequest build() {
            return new TicketHttpRequest(number, price, client);
        }
    }
}
