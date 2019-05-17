package com.example.codingchallenge.models;

import java.util.List;

public class Titles {
    public Response response;

    public class Item {

        private Integer episodeId;

        private String type;

        private String title;

        private Integer duration;

        private Boolean explicit;

        private Integer showId;

        private Integer authorId;

        private String siteUrl;

        private String imageUrl;

        private String imageOriginalUrl;

        private String publishedAt;

        private Boolean downloadEnabled;

        private String waveformUrl;

        private String downloadUrl;

        public Integer getEpisodeId() {
            return episodeId;
        }

        public void setEpisodeId(Integer episodeId) {
            this.episodeId = episodeId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public Boolean getExplicit() {
            return explicit;
        }

        public void setExplicit(Boolean explicit) {
            this.explicit = explicit;
        }

        public Integer getShowId() {
            return showId;
        }

        public void setShowId(Integer showId) {
            this.showId = showId;
        }

        public Integer getAuthorId() {
            return authorId;
        }

        public void setAuthorId(Integer authorId) {
            this.authorId = authorId;
        }

        public String getSiteUrl() {
            return siteUrl;
        }

        public void setSiteUrl(String siteUrl) {
            this.siteUrl = siteUrl;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageOriginalUrl() {
            return imageOriginalUrl;
        }

        public void setImageOriginalUrl(String imageOriginalUrl) {
            this.imageOriginalUrl = imageOriginalUrl;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public Boolean getDownloadEnabled() {
            return downloadEnabled;
        }

        public void setDownloadEnabled(Boolean downloadEnabled) {
            this.downloadEnabled = downloadEnabled;
        }

        public String getWaveformUrl() {
            return waveformUrl;
        }

        public void setWaveformUrl(String waveformUrl) {
            this.waveformUrl = waveformUrl;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

    }

    public class Response {


        private List<Item> items = null;

        private String nextUrl;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public String getNextUrl() {
            return nextUrl;
        }

        public void setNextUrl(String nextUrl) {
            this.nextUrl = nextUrl;
        }

    }
}
