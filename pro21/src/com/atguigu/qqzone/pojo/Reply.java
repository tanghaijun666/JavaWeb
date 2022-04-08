package com.atguigu.qqzone.pojo;

import java.util.Date;

/**
 * @author 彼此
 * @create 2022-03-30 11:25
 */
public class Reply {
    private Integer id;
    private String content;
    private Date replyDate;
    private UserBasic author;
    private  Topic topic;

    private  HostReply hostReply;

    public Reply() {
    }

    public Reply(Integer id, String content, Date replyDate, UserBasic author, Topic topic) {
        this.id = id;
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }

    public Reply(String content, Date replyDate, UserBasic author, Topic topic) {
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }

    public Reply(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public UserBasic getauthor() {
        return author;
    }

    public void setauthor(UserBasic author) {
        this.author = author;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }
}
