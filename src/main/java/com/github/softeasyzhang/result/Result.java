package com.github.softeasyzhang.result;


/**
 * result to user
 * code == 0 means success
 * data is JSONString
 *
 * @author EasyZhang
 * @date 2018/9/10 -  18:24
 */

public class Result {
    private int code;
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
