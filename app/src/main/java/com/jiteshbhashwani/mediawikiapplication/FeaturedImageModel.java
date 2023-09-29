package com.jiteshbhashwani.mediawikiapplication;

import android.net.Uri;

public class FeaturedImageModel {
    String imageUrl;
    String description;
    String ownerName;

    public FeaturedImageModel(String imageUrl, String description, String ownerName) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.ownerName = ownerName;
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
