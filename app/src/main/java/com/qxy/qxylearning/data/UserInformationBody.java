package com.qxy.qxylearning.data;

public class UserInformationBody {

    private String access_token;
    private String open_id;

    public UserInformationBody(){
        this.access_token = null;
        this.open_id = null;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }
}
