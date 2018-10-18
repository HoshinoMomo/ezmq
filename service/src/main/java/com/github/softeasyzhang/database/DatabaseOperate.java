package com.github.softeasyzhang.database;

import com.github.softeasyzhang.entity.DelayMessage;

import java.util.List;

/**
 * @author EasyZhang
 * @date 2018/10/18 -  17:17
 */
public interface DatabaseOperate {

    void insert();

    List<DelayMessage> getMessagesByCondition(String condition);

    void deleteByCondition(String condition);

}
