package com.github.softeasyzhang;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  18:15
 */
public interface SendCallback {

    /**
     * 消息发送成功
     */
    void onSuccess();

    /**
     * 消息发送失败
     *
     * @param des 失败原因描述
     */
    void onFailed(String des);

}
