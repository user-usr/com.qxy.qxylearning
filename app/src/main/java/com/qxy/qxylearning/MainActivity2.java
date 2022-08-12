package com.qxy.qxylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.authcode;
import com.qxy.qxylearning.manager.OkHttpManager;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "code";
    private static final String TAG1 = "token";
    authcode authcode = new authcode();
    TokenBody tokenBody = new TokenBody();
    TokenBean tokenBean = new TokenBean();
    OkHttpManager okHttpManager = new OkHttpManager();

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

                try {
                    tokenBean = okHttpManager.gettoken(tokenBody);
                    Log.i(TAG1, "token: " + tokenBean.getTokenData().getAccess_token());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}