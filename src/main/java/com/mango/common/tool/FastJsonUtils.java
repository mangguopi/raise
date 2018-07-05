package com.mango.common.tool;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: zhoujh
 * Date: 2018/3/27
 * Description:
 */
public class FastJsonUtils {
    private static final String SUCCESS_MSG = "数据加载成功";
    private static SerializeConfig mapping = new SerializeConfig();

    public FastJsonUtils() {
    }

    public static String resultSuccess(Integer code, String msg, Object data) {
        Map<String, Object> rs = new HashMap();
        rs.put("code", code);
        rs.put("msg", StringUtils.isNotEmpty(msg) ? msg : SUCCESS_MSG);
        rs.put("data", data == null ? new Object() : data);
        rs.put("error", "");
        return toString(rs);
    }

    public static String resultError(Integer code, String error, Object data) {
        Map<String, Object> rs = new HashMap();
        rs.put("code", code);
        rs.put("data", data == null ? new Object() : data);
        rs.put("error", StringUtils.isNotEmpty(error) ? error : "");
        return toString(rs);
    }

    public static <T> T parse(String jsonStr, Class<T> type) {
        return !StringUtils.isBlank(jsonStr) && null != type ? JSON.parseObject(jsonStr, type) : null;
    }

    public static <T> List<T> parseArray(String jsonStr, Class<T> type) {
        return !StringUtils.isBlank(jsonStr) && null != type ? JSON.parseArray(jsonStr, type) : null;
    }

    public static String toString(Object data) {
        return null == data ? null : JSONObject.toJSONString(data, mapping, new SerializerFeature[0]);
    }

    public static byte[] toBytes(Object data) {
        return null == data ? null : JSONObject.toJSONBytes(data, mapping, new SerializerFeature[0]);
    }

    static {
        mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
    }
}
