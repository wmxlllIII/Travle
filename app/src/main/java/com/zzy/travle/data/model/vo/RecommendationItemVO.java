package com.zzy.travle.data.model.vo;

public class RecommendationItemVO {
    private long id;
    private String title;
    private String coverImage;
    private String description;
    private double rating;
    private String location;

    public RecommendationItemVO(long id, String title, String coverImage,
                                String description, double rating, String location) {
        this.id = id;
        this.title = title;
        this.coverImage = coverImage;
        this.description = description;
        this.rating = rating;
        this.location = location;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public String getCoverImage() { return coverImage; }
    public String getDescription() { return description; }
    public double getRating() { return rating; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "RecommendationItemVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", location='" + location + '\'' +
                '}';
    }
}
