package com.jiteshbhashwani.mediawikiapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FeaturedImageDBDao {
    @Query("Select * from "+FeaturedImageDBHelper.DB_TABLE_NAME)
    List<FeaturedImageDBEntity> getAllImages();

    @Insert
    void addNewImage(FeaturedImageDBEntity featuredImageDBEntity);
    @Update
    void updateImage(FeaturedImageDBEntity featuredImageDBEntity);

    @Delete
    void deleteOneImage(FeaturedImageDBEntity featuredImageDBEntity);
}
