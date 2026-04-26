package com.zzy.travle.data.model.reqdto;

public class LoginReqDto {
    private String account;
    private String password;

    public LoginReqDto(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getUserId() {
        return account;
    }

    public void setUserId(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginReqDto{" +
                "username='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
