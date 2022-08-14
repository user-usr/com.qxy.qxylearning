package com.qxy.qxylearning.manager;



import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.qxy.qxylearning.data.FilmBean;
import com.qxy.qxylearning.data.FilmBody;
import com.qxy.qxylearning.data.FilmData;
import com.qxy.qxylearning.data.FilmList;
import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.TokenData;
import com.qxy.qxylearning.douyinapi.MyApi;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitManager {

    private static final String TAG = "gettoken";
    private String baseurl;
    private Retrofit retrofit;
    private MyApi myApi;

    public RetrofitManager(){
        this.baseurl = "https://open.douyin.com/";
        this.retrofit = new Retrofit.Builder()
                .baseUrl(this.baseurl)
//                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.myApi = retrofit.create(MyApi.class);
    }

    public TokenBean gettoken(TokenBody tokenBody) throws IOException {
        TokenBean tokenBean;

        Response<ResponseBody> response = myApi.getaccess_token(tokenBody.getClient_secret(),tokenBody.getCode(),tokenBody.getGrant_type(),tokenBody.getClient_key()).execute();
        String result = response.body().string();
        Map resultmap = (Map) JSONObject.parse(result);
        Map data = (Map) resultmap.get("data");
        String token_data = new Gson().toJson(data).toString();
        tokenBean = new Gson().fromJson(result, TokenBean.class);
        tokenBean.setTokenData(new Gson().fromJson(token_data, TokenData.class));

        return  tokenBean;

    }

    public FilmBean getmovies(FilmBody filmBody) throws IOException {
        FilmBean moviesBean = new FilmBean();
        filmBody.setType(1);

        Map<String,String> heardmap = new HashMap<>();
        heardmap.put("Content-Type","application/json");
        heardmap.put("access-token", filmBody.getAccess_token());
        Map<String,Integer> body = new HashMap<>();
        body.put("type", filmBody.getType());
        body.put("version", filmBody.getVersion());
        Response<ResponseBody> response = myApi.getmovies(heardmap,body).execute();
        String result = response.body().string();
        Map resultmap =  (Map) JSONObject.parse(result);
        Map data = (Map) resultmap.get("data");
        Map list = (Map) data.get("list");
        String list_data = new Gson().toJson(list).toString();
        String data_data = new Gson().toJson(data).toString();
        moviesBean.getData().setList(new Gson().fromJson(list_data, FilmList.class));
        moviesBean.setData(new Gson().fromJson(data_data, FilmData.class));
        Log.i(TAG, "getmovies: " + moviesBean.toString());

        return moviesBean;
    }
}
