package com.jiteshbhashwani.mediawikiapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ArticleDBDao {
    @Query("select * from "+ArticleDBHelper.DB_TABLE_NAME)
    List<ArticleDBEntity> getAllArticles();

    @Insert
    void addNewArticle(ArticleDBEntity articleDBEntity);

    @Update
    void updateArticle(ArticleDBEntity articleDBEntity);

    @Delete
    void deleteOneArticle(ArticleDBEntity articleDBEntity);
}
