package com.jiteshbhashwani.mediawikiapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FeaturedImagesFragment extends Fragment {
    ArrayList<FeaturedImageModel> featuredImageModels;
    View view;
    RecyclerView recyclerView;
    String testingImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Android_logo_2.svg/768px-Android_logo_2.svg.png";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_featured_images, container, false);
        featuredImageModels = new ArrayList<>();
        fill();//for testing recyclerview
        recyclerView = view.findViewById(R.id.images_list_view);
        FeaturedImageAdapter featuredImageAdapter = new FeaturedImageAdapter(featuredImageModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(featuredImageAdapter);
        return view;
    }
    void fill(){
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
        featuredImageModels.add(new FeaturedImageModel(testingImage,"Jitesh Bhashwani","jitesh bhashwani"));
    }
}