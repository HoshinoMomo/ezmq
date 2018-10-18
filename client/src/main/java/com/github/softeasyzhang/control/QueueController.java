package com.github.softeasyzhang.control;

import com.github.softeasyzhang.entity.DelayMessage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  18:10
 */

public class QueueController {

    /**
     * 发送消息队列
     */
    private final BlockingQueue<DelayMessage> sendQueue = new LinkedBlockingQueue<DelayMessage>();


}
