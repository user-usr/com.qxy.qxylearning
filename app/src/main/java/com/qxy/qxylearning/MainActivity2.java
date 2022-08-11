package com.qxy.qxylearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.authcode;
import com.qxy.qxylearning.manager.Apimanager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "code";
    private static final String TAG1 = "token";
    authcode authcode = new authcode();
    Apimanager apimanager = new Apimanager();
    TokenBody tokenBody = new TokenBody();

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
                Call<TokenBean> tokenBeanCall = apimanager.getMyApi().getToken(tokenBody);
                tokenBeanCall.enqueue(new Callback<TokenBean>() {
                    @Override
                    public void onResponse(@NonNull Call<TokenBean> call, @NonNull Response<TokenBean> response) {
                        assert response.body() != null;
                        Log.i(TAG1, "token: " + response.body().getTokenData().getAccess_token());
                    }

                    @Override
                    public void onFailure(@NonNull Call<TokenBean> call, @NonNull Throwable t) {
                        Log.i(TAG1, "token: " + t.toString());
                    }
                });
            }
        }).start();
    }
}