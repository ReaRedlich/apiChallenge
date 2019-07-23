package com.apiHelper;

public class Clients {
    private Clients() {}

    public static <T> T createClient(Class<T> clientClass, String baseUrl) {
        ClientBuilder clientBuilder = new ClientBuilder(baseUrl);
        return clientBuilder.build(clientClass);
    }
}
