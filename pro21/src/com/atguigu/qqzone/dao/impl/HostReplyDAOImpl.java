package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.HostReplyDAO;
import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author 彼此
 * @create 2022-04-07 15:01
 */
public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return super.load("select * from t_host_reply where reply= ?",replyId);
    }

    @Override
    public void addHostReply(HostReply hostReply) {
        super.executeUpdate("insert into t_host_reply value (0,?,?,?,?)",hostReply.getContent(),hostReply.getHostReplyDate(), hostReply.getAuthor().getId(),hostReply.getReply().getId());
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("delete from t_host_reply where id=? ",id);
    }
}
