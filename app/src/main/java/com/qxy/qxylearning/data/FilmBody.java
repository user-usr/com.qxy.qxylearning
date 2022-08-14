package com.qxy.qxylearning.data;

public class FilmBody {
    private String Content_Type;
    private String access_token;
    private String type;
    private String version;

    public FilmBody(){
        this.access_token = null;
        this.Content_Type = "application/json";
        this.type = "";
        this.version = null;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
