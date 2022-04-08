package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.ReplyDAO;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-04-07 15:34
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return super.executeQuery("select * from t_reply where topic =?", topic.getId());
    }

    @Override
    public void addReply(Reply reply) {
        super.executeUpdate("insert into t_reply values(0,?,?,?,?)", reply.getContent(), reply.getReplyDate(), reply.getauthor().getId(), reply.getTopic().getId());
    }

    @Override
    public void delReply(Integer id) {
        super.executeUpdate("delete from t_reply where id=?", id);
    }

    @Override
    public Reply getReply(Integer id) {
        return super.load("select * from t_reply where id= ?", id);
    }
}
