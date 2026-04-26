package com.zzy.travle.data.model.vo;

import androidx.annotation.NonNull;

import java.math.BigDecimal;

public class HotSpringVO {
    private Long id;
    private String name;        // 商家名称
    private String address;     // 地址
    private String city;        // 城市
    private String district;    // 行政区
    private String tag;         // 标签
    private BigDecimal rating;  // 评分
    private Integer commentCount;// 评论数
    private String imageUrl;    // 图片
    private Integer canBookToday; // 今日可订 1=是
    private Integer isOpen;     // 是否营业

    public HotSpringVO(Long id, String name, String address, String city, String district, String tag, BigDecimal rating, Integer commentCount, String imageUrl, Integer canBookToday, Integer isOpen) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.district = district;
        this.tag = tag;
        this.rating = rating;
        this.commentCount = commentCount;
        this.imageUrl = imageUrl;
        this.canBookToday = canBookToday;
        this.isOpen = isOpen;
    }

    public HotSpringVO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getCanBookToday() {
        return canBookToday;
    }

    public void setCanBookToday(Integer canBookToday) {
        this.canBookToday = canBookToday;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    @NonNull
    @Override
    public String toString() {
        return "HotSpringVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", tag='" + tag + '\'' +
                ", rating=" + rating +
                ", commentCount=" + commentCount +
                ", imageUrl='" + imageUrl + '\'' +
                ", canBookToday=" + canBookToday +
                ", isOpen=" + isOpen +
                '}';
    }
}

