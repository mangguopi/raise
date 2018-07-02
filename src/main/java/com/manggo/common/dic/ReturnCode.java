package com.manggo.common.dic;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName ReturnCode
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: 前端返回 枚举
 */
public enum ReturnCode {

    SUCCESS("200", "成功"),
    SIGN_ERROR("1001", "验签错误"),
    BUSINESS_ERROR("3000", "业务错误"),
    SYS_ERROR("4000", "系统错误");

    private String code;
    private String name;
    private static final Map<String, ReturnCode> MAPS = new HashMap();

    private ReturnCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static ReturnCode getByCode(int code) {
        return (ReturnCode) MAPS.get(code);
    }

    public boolean is(String code) {
        return null != code ? this.getCode() == code : false;
    }

    static {
        ReturnCode[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            ReturnCode item = var0[var2];
            MAPS.put(item.code, item);
        }

    }
}
