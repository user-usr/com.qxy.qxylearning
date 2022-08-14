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
public class TokenData {

    private String access_token;
    private String description;
    private String error_code;
    private String expires_in;
    private String open_id;
    private String refresh_expires_in;
    private String refresh_token;
    private String scope;
    public void setAccess_token(String access_token) {
         this.access_token = access_token;
     }
     public String getAccess_token() {
         return access_token;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setError_code(String error_code) {
         this.error_code = error_code;
     }
     public String getError_code() {
         return error_code;
     }

    public void setExpires_in(String expires_in) {
         this.expires_in = expires_in;
     }
     public String getExpires_in() {
         return expires_in;
     }

    public void setOpen_id(String open_id) {
         this.open_id = open_id;
     }
     public String getOpen_id() {
         return open_id;
     }

    public void setRefresh_expires_in(String refresh_expires_in) {
         this.refresh_expires_in = refresh_expires_in;
     }
     public String getRefresh_expires_in() {
         return refresh_expires_in;
     }

    public void setRefresh_token(String refresh_token) {
         this.refresh_token = refresh_token;
     }
     public String getRefresh_token() {
         return refresh_token;
     }

    public void setScope(String scope) {
         this.scope = scope;
     }
     public String getScope() {
         return scope;
     }

    @Override
    public String toString() {
        return "TokenData{" +
                "access_token='" + access_token + '\'' +
                ", description='" + description + '\'' +
                ", error_code='" + error_code + '\'' +
                ", expires_in='" + expires_in + '\'' +
                ", open_id='" + open_id + '\'' +
                ", refresh_expires_in='" + refresh_expires_in + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}