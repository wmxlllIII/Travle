package com.zzy.travle.data.model.vo;

public class UserVO {
    private long userId;
    private String username;
    private String email;
    private String avatar;
    private String token;
    public UserVO(long userId, String username, String email, String avatar, String token) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.token = token;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
