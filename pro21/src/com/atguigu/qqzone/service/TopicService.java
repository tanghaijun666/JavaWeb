package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-03-30 12:03
 */
public interface TopicService {
    List<Topic> getTopicList(UserBasic userBasic);
    Topic getTopicById(Integer id);
    Topic getTopic (Integer id);
    void delTopic(Integer id);
}
