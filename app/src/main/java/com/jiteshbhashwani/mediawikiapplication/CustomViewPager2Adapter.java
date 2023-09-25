package com.jiteshbhashwani.mediawikiapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jiteshbhashwani.mediawikiapplication.CategoriesFragment;
import com.jiteshbhashwani.mediawikiapplication.FeaturedImagesFragment;
import com.jiteshbhashwani.mediawikiapplication.RandomArticlesFragment;

public class CustomViewPager2Adapter extends FragmentStateAdapter {
    public CustomViewPager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new RandomArticlesFragment();
            case 1: return new FeaturedImagesFragment();
            case 2: return new CategoriesFragment();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
