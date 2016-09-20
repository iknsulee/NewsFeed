package com.example.android.newsfeed;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<NewsItem>> {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private static final String GUARDIAN_REQUEST_URL = "http://content.guardianapis.com/search";
    private static final int NEWSITEM_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView emptyStateTextView = (TextView) findViewById(R.id.empty_view);
        ListView newsFeedListView = (ListView) findViewById(R.id.list);

        newsFeedListView.setEmptyView(emptyStateTextView);
        ArrayList newsItems = new ArrayList();
        newsItems.add("hello1");
        newsItems.add("hello2");
        newsItems.add("hello3");
        newsItems.add("hello4");
        ArrayAdapter<String> newsItemArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, newsItems);

        newsFeedListView.setAdapter(newsItemArrayAdapter);
    }

    @Override
    public Loader<List<NewsItem>> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<List<NewsItem>> loader, List<NewsItem> data) {

    }

    @Override
    public void onLoaderReset(Loader<List<NewsItem>> loader) {

    }
}
