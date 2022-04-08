package com.atguigu.qqzone.service.impl;

import com.atguigu.qqzone.dao.HostReplyDAO;
import com.atguigu.qqzone.pojo.HostReply;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.UserBasic;
import com.atguigu.qqzone.service.HostReplyService;
import com.atguigu.qqzone.service.ReplyService;
import com.atguigu.qqzone.service.UserBasicService;

import javax.xml.ws.handler.Handler;
import java.util.List;

/**
 * @author 彼此
 * @create 2022-04-07 13:35
 */
public class HostReplyServiceImpl implements HostReplyService {
    HostReplyDAO hostReplyDAO;
    UserBasicService userBasicService;
    ReplyService replyService;
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        if(hostReplyDAO.getHostReplyByReplyId(replyId)!=null) {
            HostReply hostReply = hostReplyDAO.getHostReplyByReplyId(replyId);
            UserBasic userBasic = userBasicService.getUserBasicById(hostReply.getAuthor().getId());
            hostReply.setAuthor(userBasic);

//            Reply reply = replyService.getReplyById(hostReply.getReply().getId());
//            hostReply.setReply(reply);

            return hostReply;
        }
        return null;
    }

    @Override
    public HostReply getHostReplyById(Integer replyId) {
        return null;
    }

    @Override
    public void addHostReply(HostReply hostReply) {
           hostReplyDAO.addHostReply(hostReply);
    }

    @Override
    public void delHostReply(Integer id) {
             hostReplyDAO.delHostReply(id);
    }

}
