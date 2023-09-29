package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    ArrayList<String> categoriesArrayList;
    Context context;

    public CategoryAdapter(ArrayList<String> categoriesArrayList) {
        this.categoriesArrayList = categoriesArrayList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.categories_card_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.category.setText(categoriesArrayList.get(position));
        holder.cardView.setOnClickListener(view -> {
            Toast.makeText(context, categoriesArrayList.get(position) + " got clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return categoriesArrayList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView category;
        CardView cardView;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.category_card);
            category = itemView.findViewById(R.id.category_name);
        }
    }
}
