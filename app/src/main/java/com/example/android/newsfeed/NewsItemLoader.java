package com.example.android.newsfeed;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class NewsItemLoader extends AsyncTaskLoader<List<NewsItem>> {

    private static final String LOG_TAG = NewsItemLoader.class.getSimpleName();
    private String url;

    public NewsItemLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        Log.d(LOG_TAG, "onStartLoading");

        forceLoad();
    }

    @Override
    public List<NewsItem> loadInBackground() {
        Log.d(LOG_TAG, "loadInBackground");
        Log.d(LOG_TAG, this.url);

        if (this.url == null) {
            return null;
        }

        List<NewsItem> newsItems = QueryUtils.fetchNewsItemData(this.url);
        return newsItems;
    }
}
