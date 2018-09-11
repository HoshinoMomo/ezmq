package com.github.softeasyzhang.database.persist;

import com.github.softeasyzhang.entity.Message;
import com.github.softeasyzhang.entity.SearchRequest;

import java.util.List;

/**
 * @author EasyZhang
 * @date 2018/9/11 -  15:03
 */
public interface PersistTool {

    /**
     * insert the new message to your database.
     * @param message
     */
    void insert(Message message);

    /**
     * query the dataList from your database.
     * @param searchRequest
     * @return
     */
    List<? extends Message> queryList(SearchRequest searchRequest);

}
