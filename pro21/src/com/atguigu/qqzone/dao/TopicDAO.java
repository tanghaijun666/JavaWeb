package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-03-30 11:40
 */
public interface TopicDAO {
    public List<Topic> getTopicList(UserBasic userBasic);

    public void addTopic(Topic topic);

    void delTopic(Topic topic);
    Topic getTopic(Integer id);

}
