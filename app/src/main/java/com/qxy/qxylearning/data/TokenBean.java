/**
  * Copyright 2022 bejson.com 
  */
package com.qxy.qxylearning.data;

/**
 * Auto-generated: 2022-08-14 2:41:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class TokenBean {

    private TokenData tokenData;
    private String message;
    public void setTokenData(TokenData tokenData) {
         this.tokenData = tokenData;
     }
     public TokenData getTokenData() {
         return tokenData;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }


     public TokenBean(){
        this.tokenData = new TokenData();
     }

    @Override
    public String toString() {
        return "TokenBean{" +
                "tokenData=" + tokenData +
                ", message='" + message + '\'' +
                '}';
    }
}