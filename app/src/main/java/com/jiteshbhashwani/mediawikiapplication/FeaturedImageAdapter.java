package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FeaturedImageAdapter extends RecyclerView.Adapter<FeaturedImageAdapter.FeaturedImageViewHolder> {
    ArrayList<FeaturedImageModel> featuredImageModels;
    Context context;
    public FeaturedImageAdapter(ArrayList<FeaturedImageModel> featuredImageModels) {
        this.featuredImageModels = featuredImageModels;
    }

    @NonNull
    @Override
    public FeaturedImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new FeaturedImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.image_card_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedImageViewHolder holder, int position) {
        Glide.with(context)
                .load(featuredImageModels.get(position).imageUrl)
                .placeholder(R.drawable.place_holder_image)
                .into(holder.imageView);
        holder.title.setText(featuredImageModels.get(position).getDescription());
        holder.owner_name.setText(featuredImageModels.get(position).getOwnerName());
    }

    @Override
    public int getItemCount() {
        return featuredImageModels.size();
    }

    public static class FeaturedImageViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title;
        TextView owner_name;

        public FeaturedImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.main_image);
            title = itemView.findViewById(R.id.image_description);
            owner_name = itemView.findViewById(R.id.image_owner_name);
        }
    }

}
