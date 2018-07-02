package com.manggo.common.dic;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName BooleanEnum
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: 正确错误标志 枚举
 */
public enum BooleanEnum {
    YES("1", "YES"),
    NO("0", "NO");

    /**
     * 状态
     */
    private String code;
    /**
     * 名称
     */
    private String name;

    BooleanEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private static final Map<String, BooleanEnum> MAPS = new HashMap<String, BooleanEnum>();

    static {
        for (BooleanEnum item : values()) {
            MAPS.put(item.code, item);
        }
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 获取枚举项bycode
     *
     * @param code
     * @return
     */
    public static BooleanEnum getByCode(String code) {
        return MAPS.get(code);
    }
}
