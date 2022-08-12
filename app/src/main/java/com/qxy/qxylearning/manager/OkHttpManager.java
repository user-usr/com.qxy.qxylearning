package com.qxy.qxylearning.manager;

import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;

import java.io.IOException;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import com.alibaba.fastjson.JSONObject;
public class OkHttpManager {

    private String baseurl;

    public OkHttpManager(){
        this.baseurl = "https://open.douyin.com/";
    }

    public TokenBean gettoken(TokenBody tokenBody) throws IOException {
        TokenBean tokenBean = new TokenBean();

        String url = baseurl +"oauth/access_token?client_key="+ tokenBody.getClient_key() +"&client_secret="+tokenBody.getClient_secret()+"&code="+tokenBody.getCode()+"&grant_type="+tokenBody.getGrant_type();
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        String result = response.body().string();
        Map returnmap = (Map) JSONObject.parse(result);
        Map data = (Map) returnmap.get("data");
        tokenBean.getTokenData().setAccess_token((String) data.get("access_token"));
        tokenBean.getTokenData().setOpen_id((String) data.get("open_id"));

        return tokenBean;
    }

}
