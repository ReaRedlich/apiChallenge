package com.apiLogic;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RegisterEndPoint {

    @Headers("Content-Type: application/json")
    @POST("service/ottuser/action/register")
    Call<ResponseBody> register(@Body RequestBody userRegisterRequest);
}

