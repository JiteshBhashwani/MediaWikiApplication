package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = FeaturedImageDBEntity.class,exportSchema = false,version = 1)
public abstract class FeaturedImageDBHelper extends RoomDatabase {
    public static final String DB_TABLE_NAME = "featured_image_data_table";
    private static FeaturedImageDBHelper instance;

    public static synchronized FeaturedImageDBHelper getInstance(Context context) {
        if(instance == null) {
            instance = Room.databaseBuilder(context,FeaturedImageDBHelper.class,DB_TABLE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract FeaturedImageDBDao featuredImageDBDao();
}
