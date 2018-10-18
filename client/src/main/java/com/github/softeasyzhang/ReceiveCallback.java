package com.github.softeasyzhang;

import com.github.softeasyzhang.entity.DelayMessage;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  18:17
 */
public interface ReceiveCallback {

    /**
     * 收消息处理回调
     *
     * @param delayMessage 消息体
     * @throws Exception
     */
    void messageReceived(DelayMessage delayMessage) throws Exception;

    /**
     * 订阅主题号成功
     */
    void onSuccess();

    /**
     * 订阅主题号失败
     *
     * @param des 失败原因描述
     */
    void onFailed(String des);

}
