package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FeaturedImageAdapter extends BaseAdapter {

    ArrayList<FeaturedImageModel> featuredImageModels;
    View view;
    Context context;
    LayoutInflater layoutInflater;

    public FeaturedImageAdapter(ArrayList<FeaturedImageModel> featuredImageModels, View view, Context context) {
        this.featuredImageModels = featuredImageModels;
        this.view = view;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return featuredImageModels.size();
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
        view = layoutInflater.inflate(R.layout.image_card_layout,null);
        ImageView imageView = view.findViewById(R.id.main_image);
        TextView imageDescription = view.findViewById(R.id.image_description);
        TextView imageOwnerName = view.findViewById(R.id.image_owner_name);
        imageView.setImageResource(featuredImageModels.get(i).getImageId());
        imageDescription.setText(featuredImageModels.get(i).getDescription());
        imageOwnerName.setText(featuredImageModels.get(i).getOwnerName());
        return null;
    }
}
