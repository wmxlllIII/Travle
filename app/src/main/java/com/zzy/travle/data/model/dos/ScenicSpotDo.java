package com.zzy.travle.data.model.dos;

public class ScenicSpotDo {
    private long id;
    private String name;
    private String coverImage;
    private double rating;
    private int reviewCount;
    private String location;
    private double price;
    private double originalPrice;
    private String priceDesc;
    private String distance;
    private String tag;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public void setPriceDesc(String priceDesc) {
        this.priceDesc = priceDesc;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    @Override
    public String toString() {
        return "ScenicSpotDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", rating=" + rating +
                ", reviewCount=" + reviewCount +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", originalPrice=" + originalPrice +
                ", priceDesc='" + priceDesc + '\'' +
                ", distance='" + distance + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
