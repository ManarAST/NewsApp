package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by manar on 21/01/2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.news_title);
        titleView.setText(currentNews.getmTitle());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getmSection());


        TextView dateView = listItemView.findViewById(R.id.date_text_view);
        dateView.setText(currentNews.getmDate());

        TextView authorView = listItemView.findViewById(R.id.author_name);
        authorView.setText(currentNews.getmAuthor());


        return listItemView;
    }


}
