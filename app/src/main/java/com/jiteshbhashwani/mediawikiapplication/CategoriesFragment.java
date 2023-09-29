package com.jiteshbhashwani.mediawikiapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CategoriesFragment extends Fragment {

    ArrayList<String> categories;
    View view;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_categories, container, false);
        categories = new ArrayList<>();
        fill();
        recyclerView = view.findViewById(R.id.category_recycler_view);
        CategoryAdapter categoryAdapter = new CategoryAdapter(categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(categoryAdapter);


        return view;
    }

    private void fill() {
        categories.add("List of Indian film industries");
        categories.add("List of MPs elected in UK elections templates");
        categories.add("List of Nigerian Universities");
        categories.add("List of Vietnamese people");
        categories.add("List of association football clubs in the Republic of Ireland templates");
        categories.add("List of cabinet templates");
        categories.add("List of earthquakes in China");
        categories.add("List of intercommunalities in France");
        categories.add("List of people from Uttarakhand");
        categories.add("List of place names of Choctaw origin in the United States");

    }
}