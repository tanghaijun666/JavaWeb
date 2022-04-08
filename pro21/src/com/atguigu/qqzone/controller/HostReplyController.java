package com.atguigu.qqzone.controller;

import com.atguigu.qqzone.pojo.HostReply;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;
import com.atguigu.qqzone.service.HostReplyService;
import com.atguigu.qqzone.service.ReplyService;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author 彼此
 * @create 2022-04-08 6:36
 */
public class HostReplyController {
    ReplyService replyService;
    HostReplyService hostReplyService;
    public String addHostReply(String content, Integer replyId, Integer topicId,HttpSession session) {
        UserBasic userBasic = (UserBasic) session.getAttribute("userBasic");
        Reply reply=replyService.getReplyById(replyId);
        HostReply hostReply=new HostReply(content,new Date(),userBasic,reply);
       hostReplyService.addHostReply(hostReply);
        return "redirect:topic.do?operate=topicDetail&id="+topicId;
    }
}
