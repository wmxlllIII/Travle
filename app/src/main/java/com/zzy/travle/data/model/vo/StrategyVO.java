package com.zzy.travle.data.model.vo;

import java.util.List;

public class StrategyVO {

    private long id;

    // 用户信息
    private String userAvatar;
    private String userName;

    // 内容
    private String title;
    private String summary;
    private String cover;
    // 图片
    private List<String> imageUrls;

    // 标签
    private List<String> tags;

    // 时间
    private String publishTime;

    // 数据统计
    private int likeCount;
    private int commentCount;
    private int collectCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    @Override
    public String toString() {
        return "StrategyVO{" +
                "id=" + id +
                ", userAvatar='" + userAvatar + '\'' +
                ", userName='" + userName + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", imageUrls=" + imageUrls +
                ", tags=" + tags +
                ", publishTime='" + publishTime + '\'' +
                ", likeCount=" + likeCount +
                ", commentCount=" + commentCount +
                ", collectCount=" + collectCount +
                '}';
    }
}
