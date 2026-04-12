package com.zzy.travle.data.model.dos;

public class RecommendationItemDO {
    private long id;
    private String title;
    private String coverImage;
    private String description;
    private double rating;
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "RecommendationItemDO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", location='" + location + '\'' +
                '}';
    }
}
