package com.manggo.common.model;

import com.manggo.common.dic.ReturnCode;

import java.io.Serializable;

/**
 * ClassName ActionResult
 * Author: 周加辉
 * Date: 2018/6/22
 * Version 1.0
 * Description: 统一前端返回参数
 */
public class ActionResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;


    private String code;

    private String message;

    private T data;

    public ActionResult() {
        this.code = ReturnCode.SUCCESS.getCode();
        this.message = ReturnCode.SUCCESS.getName();
    }

    public ActionResult(T data) {
        this.code = ReturnCode.SUCCESS.getCode();
        this.message = ReturnCode.SUCCESS.getName();
        this.data = data;
    }

    public ActionResult(ReturnCode ReturnCode) {
        this.code = ReturnCode.getCode();
        this.message = ReturnCode.getName();
    }

    public ActionResult(ReturnCode ReturnCode, String message) {
        this.code = ReturnCode.getCode();
        this.message = message;
    }

    public ActionResult(ReturnCode ReturnCode, T data) {
        this.code = ReturnCode.getCode();
        this.message = ReturnCode.getName();
        this.data = data;
    }

    public ActionResult(ReturnCode ReturnCode, String message, T data) {
        this.code = ReturnCode.getCode();
        this.message = message;
        this.data = data;
    }

    public void setReturnCode(ReturnCode ReturnCode) {
        this.code = ReturnCode.getCode();
        this.message = ReturnCode.getName();
    }

    public void setReturnCode(ReturnCode ReturnCode, String message) {
        this.code = ReturnCode.getCode();
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActionResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
