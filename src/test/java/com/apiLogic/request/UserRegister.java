package com.apiLogic.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRegister {

    @SerializedName("partnerId")
    @Expose
    private Integer partnerId;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("password")
    @Expose
    private String password;

    public UserRegister(Integer partnerId, User user, String password) {
        this.partnerId = partnerId;
        this.user = user;
        this.password = password;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
