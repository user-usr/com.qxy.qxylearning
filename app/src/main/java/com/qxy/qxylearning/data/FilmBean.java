package com.qxy.qxylearning.data;

public class FilmBean {

        private FilmData filmData;

        public FilmBean(){
            this.filmData = new FilmData();
        }

        public void setData(FilmData filmData) {
            this.filmData = filmData;
        }
        public FilmData getData() {
            return filmData;
        }
}
