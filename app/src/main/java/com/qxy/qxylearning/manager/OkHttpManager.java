package com.qxy.qxylearning.manager;

import android.util.Log;

import com.qxy.qxylearning.data.FilmBean;
import com.qxy.qxylearning.data.FilmBody;
import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import com.alibaba.fastjson.JSONObject;
public class OkHttpManager {

    private static final String TAG = "movi_data";
    private String baseurl;

    public OkHttpManager(){
        this.baseurl = "https://open.douyin.com/";
    }

    public TokenBean gettoken(TokenBody tokenBody) throws IOException {
        TokenBean tokenBean = new TokenBean();

        String url = baseurl +"oauth/access_token/?client_key="+ tokenBody.getClient_key() +"&client_secret="+tokenBody.getClient_secret()+"&code="+tokenBody.getCode()+"&grant_type="+tokenBody.getGrant_type();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        String result = response.body().string();
        Map returnmap = (Map) JSONObject.parse(result);
        Map data = (Map) returnmap.get("data");
        tokenBean.getTokenData().setAccess_token((String) data.get("access_token"));
        tokenBean.getTokenData().setOpen_id((String) data.get("open_id"));
        tokenBean.getTokenData().setRefresh_token((String) data.get("refresh_token"));

        return tokenBean;
    }

    public FilmBean GetMovies(FilmBody filmBody) throws IOException {
        FilmBean filmBean = new FilmBean();
        filmBody.setType(1);

        String url = baseurl +"discovery/ent/rank/item/?access_token="+ filmBody.getAccess_token()+ "type="+ filmBody.getType() + "&version=" + null;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String result = Objects.requireNonNull(response.body()).string();
        Map returnmap = (Map) JSONObject.parse(result);
        Map data = (Map) returnmap.get("data");
        assert data != null;
        Log.i(TAG, "GetMovies: " + data.toString());
        Log.i(TAG, "move_token: " + filmBody.getAccess_token());
//        Map list = (Map) data.get("list");
//        filmBean.getData().setActive_time((String) data.get("active_time"));
//        filmBean.getData().getList().setActors(Arrays.asList(list.get("actors").toString()));
//        filmBean.getData().getList().setAreas(Arrays.asList(list.get("areas").toString()));
//        filmBean.getData().getList().setDirectors(Arrays.asList(list.get("directors").toString()));
//        filmBean.getData().getList().setName((String) list.get("name"));
//        filmBean.getData().getList().setName_en((String) list.get("name_en"));
//        filmBean.getData().getList().setTags(Arrays.asList(list.get("tags").toString()));

        return filmBean;
    }

    public TokenBean getrefreshtoken(TokenBean tokenBean, TokenBody tokenBody) throws IOException {
        TokenBean new_tokenBean = new TokenBean();

        String url = baseurl +"oauth/refresh_token/?client_key="+ tokenBody.getClient_key() +"&grant_type="+"refresh_token"+"&refresh_token="+tokenBean.getTokenData().getRefresh_token();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        String result = response.body().string();
        Map returnmap = (Map) JSONObject.parse(result);
        Map data = (Map) returnmap.get("data");
        Log.i(TAG, "newnew_token: " + data.toString());
        new_tokenBean.getTokenData().setAccess_token((String) data.get("access_token"));
        new_tokenBean.getTokenData().setOpen_id((String) data.get("open_id"));
        new_tokenBean.getTokenData().setRefresh_token((String) data.get("refresh_token"));

        return new_tokenBean;

    }

}
