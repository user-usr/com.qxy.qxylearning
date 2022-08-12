package com.qxy.qxylearning;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson.JSONObject;
import android.os.Bundle;
import android.util.Log;

import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.authcode;

import java.io.IOException;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "code";
    private static final String TAG1 = "token";
    authcode authcode = new authcode();
    TokenBody tokenBody = new TokenBody();
    TokenBean tokenBean = new TokenBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        new Thread(new Runnable() {
            @Override
            public void run() {
                while (authcode.getAuthcode() == null){
                    authcode.setAuthcode(getIntent().getStringExtra("code"));
                }
                Log.i(TAG, "code: " + authcode.getAuthcode());
                tokenBody.setCode(authcode.getAuthcode());
                tokenBody.setClient_key("awdvkxoqgq54bq16");
                tokenBody.setClient_secret("900cb2f34b362f7c5d77c0ab419186c9");
                try {
                    String url = "https://open.douyin.com/" +"oauth/client_token/?client_key="+ tokenBody.getClient_key() +"&client_secret="+tokenBody.getClient_secret()+"&grant_type=client_credential"+"&code="+tokenBody.getCode();
                    OkHttpClient okHttpClient = new OkHttpClient();
                    Request request = new Request.Builder().url(url).build();
                    Response response = okHttpClient.newCall(request).execute();
                    String result = response.body().string();
                    Map returnmap = (Map) JSONObject.parse(result);
                    Map data = (Map) returnmap.get("data");
                    tokenBean.getTokenData().setAccess_token((String) data.get("access_token"));
                    tokenBean.getTokenData().setOpen_id((String) data.get("open_id"));
                    Log.i(TAG1, "token: " + tokenBean.getTokenData().getAccess_token());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}