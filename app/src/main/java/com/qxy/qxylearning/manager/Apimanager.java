package com.qxy.qxylearning.manager;

import com.qxy.qxylearning.douyinapi.MyApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apimanager {

    Retrofit retrofit;


    MyApi myApi;

    public Apimanager(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://open.douyin.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myApi = retrofit.create(MyApi.class);
    }

    public MyApi getMyApi() {
        return myApi;
    }

    public void setMyApi(MyApi myApi) {
        this.myApi = myApi;
    }
}
