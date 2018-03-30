package com.bbu.shop.commons.dto;

/**
 * User: DHC
 * Date: 2018/3/28
 * Time: 16:55
 * Version:V1.0
 */
public class ResultObject {

    private boolean success;
    private String message;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
