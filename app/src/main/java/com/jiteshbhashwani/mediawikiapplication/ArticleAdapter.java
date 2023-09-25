package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends BaseAdapter {
    ArrayList<ArticleModel> articleViewModels;
    View view;
    Context context;
    LayoutInflater layoutInflater;
    public ArticleAdapter(ArrayList<ArticleModel> articleViewModels, View view, Context context) {
        this.articleViewModels = articleViewModels;
        this.view = view;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return articleViewModels.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.article_custom_card_layout,null);
        ImageView cover = view.findViewById(R.id.article_cover);
        TextView title = view.findViewById(R.id.article_title);
        TextView sub = view.findViewById(R.id.article_subtext);
        TextView content = view.findViewById(R.id.article_text);
        cover.setImageResource(articleViewModels.get(i).getCover_id());
        title.setText(articleViewModels.get(i).getTitle());
        sub.setText(articleViewModels.get(i).getSubText());
        content.setText(articleViewModels.get(i).getText());
        return view;
    }
}
