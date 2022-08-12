package com.qxy.qxylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.qxy.qxylearning.data.FilmBean;
import com.qxy.qxylearning.data.FilmBody;
import com.qxy.qxylearning.data.TokenBean;
import com.qxy.qxylearning.data.TokenBody;
import com.qxy.qxylearning.data.authcode;
import com.qxy.qxylearning.manager.OkHttpManager;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "code";
    private static final String TAG1 = "token";
    private static final String TAG2 = "movies_name";
    authcode authcode = new authcode();
    TokenBody tokenBody = new TokenBody();
    TokenBean tokenBean = new TokenBean();
    TokenBean new_tokenBean = new TokenBean();
    OkHttpManager okHttpManager = new OkHttpManager();
    FilmBean moviesBean = new FilmBean();
    FilmBody filmBody = new FilmBody();

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
                    Log.i(TAG1, "refresh_token: " + tokenBean.getTokenData().getRefresh_token());
                } catch (IOException e) {
                    e.printStackTrace();
                }


                try {
                    new_tokenBean = okHttpManager.getrefreshtoken(tokenBean, tokenBody);
                    Log.i(TAG1, "new_token: " + new_tokenBean.getTokenData().getAccess_token());
                    Log.i(TAG1, "new_refresh_token: " + new_tokenBean.getTokenData().getRefresh_token());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                filmBody.setAccess_token(new_tokenBean.getTokenData().getAccess_token());
                try {
                    moviesBean = okHttpManager.GetMovies(filmBody);
                    Log.i(TAG2, "movies_name: " + moviesBean.getData().getList().getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}