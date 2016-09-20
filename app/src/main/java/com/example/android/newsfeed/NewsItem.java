package com.example.android.newsfeed;

/**
 * Created by donbosco on 2016-09-20.
 */
public class NewsItem {
    private String webTitle;
    private String webUrl;
    private String apiUrl;
    private String webPublicationDate;

    public NewsItem(String webTitle, String webUrl, String apiUrl, String webPublicationDate) {
        this.webTitle = webTitle;
        this.webUrl = webUrl;
        this.apiUrl = apiUrl;
        this.webPublicationDate = webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "webTitle='" + webTitle + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", webPublicationDate='" + webPublicationDate + '\'' +
                '}';
    }
}
