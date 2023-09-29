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

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {
    ArrayList<ArticleModel> articleViewModels;
    Context context;

    public ArticleAdapter(ArrayList<ArticleModel> articleViewModels) {
        this.articleViewModels = articleViewModels;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ArticleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.article_custom_card_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Glide.with(context)
                .load(articleViewModels.get(position).getCover_url())
                .placeholder(R.drawable.place_holder_image)
                .into(holder.article_cover);
        holder.article_title.setText(articleViewModels.get(position).getTitle());
        holder.article_subtext.setText(articleViewModels.get(position).getSubText());
        holder.article_text.setText(articleViewModels.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return articleViewModels.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder{
        ImageView article_cover;
        TextView article_title;
        TextView article_subtext;
        TextView article_text;
        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            article_cover = itemView.findViewById(R.id.article_cover);
            article_title = itemView.findViewById(R.id.article_title);
            article_text = itemView.findViewById(R.id.article_text);
            article_subtext = itemView.findViewById(R.id.article_subtext);
        }
    }
}
