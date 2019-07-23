package com.apiHelper;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * This class create the json body - get object and convert to json
 * Gson is a java API from Google that converts java objects to their JSON representations and vice-vers
 */
public class Request {

    public Request() {}

    public RequestBody createBody(Object object) {
        return RequestBody.create(MediaType.parse(ContentType.JSON.getContentType()), new Gson().toJson(object));
    }
}
