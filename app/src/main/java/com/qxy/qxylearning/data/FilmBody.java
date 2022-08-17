package com.qxy.qxylearning.data;

public class FilmBody {
    private String type;
//    private int version;

    public FilmBody(){
        this.type = "1";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }

//    @Override
//    public String toString() {
//        return "FilmBody{" +
//                "type=" + type +
//                ", version=" + version +
//                '}';
//    }


    @Override
    public String toString() {
        return "FilmBody{" +
                "type=" + type +
                '}';
    }
}
