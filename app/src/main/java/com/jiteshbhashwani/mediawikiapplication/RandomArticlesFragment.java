package com.jiteshbhashwani.mediawikiapplication;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RandomArticlesFragment extends Fragment {

    ArrayList<ArticleModel> articleModelArrayList;
    View view;
    RecyclerView recyclerView;
    String testingImage = "https://media.licdn.com/dms/image/D4D03AQFpCmhTG3R-mA/profile-displayphoto-shrink_800_800/0/1666059101130?e=1701302400&v=beta&t=NdvQ8R_B9sHXDc4Q1W2Oh37EKQ8oZhETKaCfJE6ecuk";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_random_articles, container, false);
        articleModelArrayList = new ArrayList<>();
        fill(); // for testing recyclerview
        recyclerView = view.findViewById(R.id.articles_list_view);
        ArticleAdapter articleAdapter = new ArticleAdapter(articleModelArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(articleAdapter);
        return view;
    }
    void fill(){
//        ArticleModel testArticle = new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
        articleModelArrayList.add(new ArticleModel(testingImage,"Sample title","Sample subtext",getString(R.string.lorem_ipsum)));
    }
}