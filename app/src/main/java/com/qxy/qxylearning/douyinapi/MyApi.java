package com.qxy.qxylearning.douyinapi;

import com.qxy.qxylearning.data.TokenBean;

import java.util.Map;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface MyApi {

//    @Headers("Content-Type: application/x-www-form-urlencoded")
    @GET("oauth/access_token/")
    Call<ResponseBody> getaccess_token(@Query("client_secret") String client_secret, @Query("code") String code, @Query("grant_type") String grant_type, @Query("client_key") String client_key);

    @POST("discovery/ent/rank/item/")
    Call<ResponseBody> getmovies(@Header("access-token") String access_token, @Query("type") int type, @Query("version") String version);
}
