package com.qxy.qxylearning.data;

public class TokenBean {
    private TokenData tokenData;
    private String message;

    public TokenBean(){
        this.tokenData = new TokenData();
    }

    public TokenData getTokenData() {
        return tokenData;
    }

    public void setTokenData(TokenData tokenData) {
        this.tokenData = tokenData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
