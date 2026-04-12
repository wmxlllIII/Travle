package com.zzy.travle.data.model.vo;

public class ScenicSpotVO {
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

    public ScenicSpotVO(long id, String name, String coverImage, double rating,
                        int reviewCount, String location, double price,
                        double originalPrice, String priceDesc, String distance, String tag) {
        this.id = id;
        this.name = name;
        this.coverImage = coverImage;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.location = location;
        this.price = price;
        this.originalPrice = originalPrice;
        this.priceDesc = priceDesc;
        this.distance = distance;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public double getRating() {
        return rating;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public String getDistance() {
        return distance;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "ScenicSpotVO{" +
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
