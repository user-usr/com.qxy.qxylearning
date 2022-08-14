package com.qxy.qxylearning.data;

public class FilmBody {
    private String Content_Type;
    private String access_token;
    private int type;
    private int version;

    public FilmBody(){
        this.access_token = null;
        this.Content_Type = "application/json";
        this.type = 1;
    }

    public String getContent_Type() {
        return Content_Type;
    }

    public void setContent_Type(String content_Type) {
        Content_Type = content_Type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
