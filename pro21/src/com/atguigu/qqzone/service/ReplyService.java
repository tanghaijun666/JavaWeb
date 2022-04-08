package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-04-07 8:44
 */
public interface ReplyService {
    List<Reply> getReplyListByTopicId(Integer topicId);
Reply getReplyById(Integer replyId);
    void addReply(Reply reply);

    void delReply(Integer id);
     void delReplyList(Topic topic);
}
