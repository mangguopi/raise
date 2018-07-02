package com.mango.model.paramin;

/**
 * ClassName UserLoginParamIn
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: TODO
 */
public class UserLoginParamIn {
    private String mobile;

    private String code;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserLoginParamIn{" +
                "mobile='" + mobile + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
