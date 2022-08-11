package com.qxy.qxylearning.douyinapi;

import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MyApi {

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("oauth/access_token/")
    Call<TokenBean> getToken(@Body TokenBody tokenBody);
}
