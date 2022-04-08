package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author 彼此
 * @create 2022-04-07 13:34
 */
public interface HostReplyService {
    HostReply getHostReplyById(Integer replyId);
    HostReply getHostReplyByReplyId(Integer replyId);
    void addHostReply(HostReply hostReply);
    void delHostReply(Integer id);
}
