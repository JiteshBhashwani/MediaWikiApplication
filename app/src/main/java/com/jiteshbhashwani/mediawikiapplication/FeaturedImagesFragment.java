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
    String testingImage = "https://media.licdn.com/dms/image/D4D03AQFpCmhTG3R-mA/profile-displayphoto-shrink_800_800/0/1666059101130?e=1701302400&v=beta&t=NdvQ8R_B9sHXDc4Q1W2Oh37EKQ8oZhETKaCfJE6ecuk";
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