package com.github.softeasyzhang.database.defaults;


import com.github.softeasyzhang.database.DatabaseOperate;
import com.github.softeasyzhang.entity.DelayMessage;

import java.util.List;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  17:17
 */

public class DefaultDatabaseOperate implements DatabaseOperate{

    public void insert(DelayMessage delayMessage) {

    }

    public List<DelayMessage> getMessagesByCondition(String condition) {
        return null;
    }

    public void deleteByCondition(String condition) {

    }
}
