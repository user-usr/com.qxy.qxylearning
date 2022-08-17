package com.qxy.qxylearning.douyinapi;

import com.qxy.qxylearning.data.FilmBody;
import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.UserInformationBody;

import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface MyApi {

    @Headers("Content-Type: application/json")
    @POST("oauth/access_token/")
    Call<ResponseBody> getaccess_token(@Body TokenBody tokenBody);

    @GET("discovery/ent/rank/item/")
    Call<ResponseBody> getmovies(@HeaderMap Map<String,String> heardmap, @Query("type") String type, @Query("version") String version);

    @POST("oauth/userinfo/")
    Call<ResponseBody> getuserinformation(@HeaderMap Map<String,String> heardmap, @Body UserInformationBody userInformationBody);
}
