package com.jiteshbhashwani.mediawikiapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = FeaturedImageDBHelper.DB_TABLE_NAME)
public class FeaturedImageDBEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "imageUrl")
    String imageUrl;
    @ColumnInfo(name = "title")
    String description;
    @ColumnInfo(name = "ownerName")
    String ownerName;

    public FeaturedImageDBEntity(String imageUrl, String description, String ownerName) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
