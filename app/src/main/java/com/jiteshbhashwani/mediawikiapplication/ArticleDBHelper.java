package com.jiteshbhashwani.mediawikiapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = ArticleDBEntity.class, exportSchema = false, version = 1)
public abstract class ArticleDBHelper extends RoomDatabase {
    public static final String DB_TABLE_NAME = "article_table";
    private static ArticleDBHelper instance;

    public static synchronized ArticleDBHelper getInstance(Context context) {
        if(instance == null){
            instance = Room.databaseBuilder(context,ArticleDBHelper.class,DB_TABLE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract ArticleDBDao articleDBDao();

}
