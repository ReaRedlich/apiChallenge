package com.apiHelper;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.json.GsonJsonProvider;
import com.jayway.jsonpath.spi.mapper.GsonMappingProvider;
import okhttp3.ResponseBody;
import retrofit2.Response;
import java.io.IOException;

/**
 *     This class uses JsonPath package with two different configurations:
 *          1) gsonConf for custom objects deserialization
 *          2) jsonOrgConf for deserialization to JSONObject and JSONArray of org.json package
 *     By default JsonPath uses JsonSmart package
 *     To check valid content-type before deserialization use ServiceApiManagers
 */
public class Deserialization {

    public Deserialization() {}


    public <T> T getObject(Response<ResponseBody> response, Class<T> objectClass) throws IOException {
        return getObject(response, objectClass, "$");
    }

    public <T> T getObject(Response<ResponseBody> response, Class<T> objectClass, String jsonPath) throws IOException {
        String json = getRawBody(response);
        System.out.println("Response Body: " + json);
        return getObject(json, objectClass, jsonPath);
    }

    public String getRawBody(Response<ResponseBody> response) throws IOException {
        return response.body().string();
    }

    public <T> T getObject(String json, Class<T> objectClass, String jsonPath) {
        return JsonPath.using(gsonConf).parse(json).read(jsonPath, objectClass);
    }

    private static Configuration gsonConf = Configuration
            .builder()
            .jsonProvider(new GsonJsonProvider())
            .mappingProvider(new GsonMappingProvider())
            .build();
}
