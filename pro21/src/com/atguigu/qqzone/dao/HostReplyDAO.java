package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author 彼此
 * @create 2022-03-30 11:40
 */
public interface HostReplyDAO {
    HostReply getHostReplyByReplyId(Integer replyId);
    void addHostReply(HostReply hostReply);
    void delHostReply(Integer id);
}
