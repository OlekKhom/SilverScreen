package pl.cinema.SilverScreen.Client.model;

public class ClientHttpRequest {

    private String name;
    private int password;

    public ClientHttpRequest(String name, int password) {
        this.name = name;
        this.password = password;
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

    public static ClientHttpRequestBuilder builder() {
        return new ClientHttpRequestBuilder();
    }

    public static final class ClientHttpRequestBuilder {
        private String name;
        private int password;

        private ClientHttpRequestBuilder() {
        }

        public ClientHttpRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ClientHttpRequestBuilder password(int password) {
            this.password = password;
            return this;
        }

        public ClientHttpRequest build() {
            return new ClientHttpRequest(name, password);
        }
    }
}
