package com.github.softeasyzhang;


import com.github.softeasyzhang.entity.DelayMessage;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  18:27
 */

public class Example {

    public static void main(String[] args){

    }

    public static void sub(){
        Client client = new Client();

        client.subscribe("topic", new ReceiveCallback() {
            public void messageReceived(DelayMessage delayMessage) throws Exception {
                //接受消息delayMessage
            }

            public void onSuccess() {
                //订阅成功
            }

            public void onFailed(String des) {
                //订阅失败
            }
        });
    }

    public static void send(DelayMessage delayMessage, SendCallback sendCallback){
        Client client = new Client();
        client.send(delayMessage,sendCallback);
    }
}
