package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author 彼此
 * @create 2022-03-30 11:40
 */
public interface UserBasicDAO {
    public UserBasic getUserBasic(String loginId,String pwd);
    public List<UserBasic> getUserBasicList(UserBasic userBasic);
    UserBasic getUserBasicById(Integer id);
}
