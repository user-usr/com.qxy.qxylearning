package com.qxy.qxylearning.data;

import java.util.List;

public class FilmList {

        private List<String> actors;
        private List<String> areas;
        private List<String> directors;
        private String discussion_hot;
        private String hot;
        private String id;
        private String influence_hot;
        private String maoyan_id;
        private String name;
        private String name_en;
        private String poster;
        private String release_date;
        private String search_hot;
        private List<String> tags;
        private String topic_hot;
        private String type;
        public void setActors(List<String> actors) {
            this.actors = actors;
        }
        public List<String> getActors() {
            return actors;
        }

        public void setAreas(List<String> areas) {
            this.areas = areas;
        }
        public List<String> getAreas() {
            return areas;
        }

        public void setDirectors(List<String> directors) {
            this.directors = directors;
        }
        public List<String> getDirectors() {
            return directors;
        }

        public void setDiscussion_hot(String discussion_hot) {
            this.discussion_hot = discussion_hot;
        }
        public String getDiscussion_hot() {
            return discussion_hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }
        public String getHot() {
            return hot;
        }

        public void setId(String id) {
            this.id = id;
        }
        public String getId() {
            return id;
        }

        public void setInfluence_hot(String influence_hot) {
            this.influence_hot = influence_hot;
        }
        public String getInfluence_hot() {
            return influence_hot;
        }

        public void setMaoyan_id(String maoyan_id) {
            this.maoyan_id = maoyan_id;
        }
        public String getMaoyan_id() {
            return maoyan_id;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }
        public String getName_en() {
            return name_en;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }
        public String getPoster() {
            return poster;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }
        public String getRelease_date() {
            return release_date;
        }

        public void setSearch_hot(String search_hot) {
            this.search_hot = search_hot;
        }
        public String getSearch_hot() {
            return search_hot;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }
        public List<String> getTags() {
            return tags;
        }

        public void setTopic_hot(String topic_hot) {
            this.topic_hot = topic_hot;
        }
        public String getTopic_hot() {
            return topic_hot;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

    @Override
    public String toString() {
        return "FilmList{" +
                "actors=" + actors +
                ", areas=" + areas +
                ", directors=" + directors +
                ", discussion_hot='" + discussion_hot + '\'' +
                ", hot='" + hot + '\'' +
                ", id='" + id + '\'' +
                ", influence_hot='" + influence_hot + '\'' +
                ", maoyan_id='" + maoyan_id + '\'' +
                ", name='" + name + '\'' +
                ", name_en='" + name_en + '\'' +
                ", poster='" + poster + '\'' +
                ", release_date='" + release_date + '\'' +
                ", search_hot='" + search_hot + '\'' +
                ", tags=" + tags +
                ", topic_hot='" + topic_hot + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
