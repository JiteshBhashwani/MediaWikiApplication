package com.jiteshbhashwani.mediawikiapplication;

public class FeaturedImageModel {
    int imageId;
    String description;
    String ownerName;

    public FeaturedImageModel(int imageId, String description, String ownerName) {
        this.imageId = imageId;
        this.description = description;
        this.ownerName = ownerName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
