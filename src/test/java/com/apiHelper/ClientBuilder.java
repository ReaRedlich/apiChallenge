package com.apiHelper;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

/**
 * This class build the API with baseUrl, path and Content-Type, included Header and Query if we have.
 */
public class ClientBuilder {

    private String baseUrl;

    public ClientBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public <T> T build(Class<T> clientClass) {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.connectTimeout(60, TimeUnit.SECONDS);
        client.readTimeout(60, TimeUnit.SECONDS);
        client.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE));
        Retrofit retrofit = new Retrofit.Builder()
                .client(client.build())
                .baseUrl(this.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(clientClass);
    }
}
