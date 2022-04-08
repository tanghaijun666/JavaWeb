package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.service.ReplyService;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-03-30 11:40
 */
public interface ReplyDAO {
    List<Reply> getReplyList(Topic topic);
    void addReply(Reply reply);
    void delReply(Integer id);
    Reply getReply(Integer id);
}
