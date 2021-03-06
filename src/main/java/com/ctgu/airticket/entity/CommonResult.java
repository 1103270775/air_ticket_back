package com.ctgu.airticket.entity;

/**
 * @Author:Mr.zhou
 * @Package:com.ctgu.airticket.entity
 * @Date:2020/12/20
 * @Description:
 * @Version 1.0
 */
public class CommonResult<T> {
    private int code;
    private String msg;
    private int count;
    private T data;

    public CommonResult(int code, String msg, int count, T data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
