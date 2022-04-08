package com.atguigu.qqzone.controller;

import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;
import com.atguigu.qqzone.service.HostReplyService;
import com.atguigu.qqzone.service.ReplyService;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author 彼此
 * @create 2022-04-07 21:47
 */
public class ReplyController {
    private ReplyService replyService;
    private HostReplyService hostReplyService;

    public String addReply(String content, Integer topicId, HttpSession session) {
        UserBasic userBasic = (UserBasic) session.getAttribute("userBasic");
        Reply reply = new Reply(content, new Date(), userBasic, new Topic(topicId));

        replyService.addReply(reply);
        return "redirect:topic.do?operate=topicDetail&id="+topicId;
    }
 public String delReply(Integer replyId,Integer topicId){
        replyService.delReply(replyId);
     return "redirect:topic.do?operate=topicDetail&id="+topicId;
 }
}
