package com.github.softeasyzhang;

import com.github.softeasyzhang.database.DatabaseOperate;
import com.github.softeasyzhang.database.defaults.DefaultDatabaseOperate;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  17:56
 */

public class Client {

    private DatabaseOperate databaseOperate;

    public Client(){
        databaseOperate = new DefaultDatabaseOperate();
    }

    public Client(DatabaseOperate databaseOperate){
        this.databaseOperate = databaseOperate;
    }
}
