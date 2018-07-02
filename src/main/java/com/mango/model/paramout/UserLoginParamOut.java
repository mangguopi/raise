package com.mango.model.paramout;

/**
 * ClassName UserLoginParamOut
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: TODO
 */
public class UserLoginParamOut {
    private String userId;

    private String token;

    private String refreshToken;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "UserLoginParamOut{" +
                "userId='" + userId + '\'' +
                ", token='" + token + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
