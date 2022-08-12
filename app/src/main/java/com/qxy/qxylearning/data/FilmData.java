package com.qxy.qxylearning.data;

public class FilmData {

        private String active_time;
        private String description;
        private String error_code;
        private FilmList filmList;

        public FilmData(){
            this.filmList = new FilmList();
        }

        public void setActive_time(String active_time) {
            this.active_time = active_time;
        }
        public String getActive_time() {
            return active_time;
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

        public void setList(FilmList filmList) {
            this.filmList = filmList;
        }
        public FilmList getList() {
            return filmList;
        }
}
