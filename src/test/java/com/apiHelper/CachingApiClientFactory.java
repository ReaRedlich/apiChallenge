package com.apiHelper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * It's not possible to have a base Retrofit interface.
 * That's why base interface of any Retrofit interface is Object
 */
public class CachingApiClientFactory {

    private final Map<Class<?>, Object> cache = new ConcurrentHashMap<>();

    public CachingApiClientFactory() {}

    public <T> T get(Class<T> objectClass) {
        Object client = cache.get(objectClass);
        String baseUrl = BaseUrl.REGISTER_BASE_URL.getBaseUrl();
        client = Clients.createClient(objectClass, baseUrl);
        cache.put(objectClass, client);
        return (T) client;
    }
}
