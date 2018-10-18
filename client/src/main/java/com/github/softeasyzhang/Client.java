package com.github.softeasyzhang;

import com.github.softeasyzhang.database.DatabaseOperate;
import com.github.softeasyzhang.database.defaults.DefaultDatabaseOperate;
import com.github.softeasyzhang.entity.DelayMessage;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  17:56
 */

public class Client {

    private final static int MIN_DELAY_TIME = 10;
    private DatabaseOperate databaseOperate;

    public Client(){
        databaseOperate = new DefaultDatabaseOperate();
    }

    public Client(DatabaseOperate databaseOperate){
        this.databaseOperate = databaseOperate;
    }

    public void send(DelayMessage delayMessage, SendCallback sendCallback){
        //小于10秒不要
        if(delayMessage.getDelayTime() <= MIN_DELAY_TIME){
            return;
        }
         databaseOperate.insert(delayMessage);
    }

    public void subscribe(String topic, ReceiveCallback receiveCallback){

    }
}
