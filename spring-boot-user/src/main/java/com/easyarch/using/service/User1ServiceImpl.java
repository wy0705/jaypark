package com.easyarch.using.service;

import com.easyarch.using.dao.User1Dao;
import com.easyarch.using.entity.User1;
import com.easyarch.using.service.im.IUser1Seivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1ServiceImpl implements IUser1Seivice {
    @Autowired
    private User1Dao user1Dao;
    @Override
    public User1 findByuser(int uid) {
        return user1Dao.findByuser(uid);
    }

    @Override
    public User1 findByname(String name) {
        return user1Dao.findByname(name);
    }

    @Override
    public int insertUser1(User1 user1) {
        return user1Dao.insertUser1(user1);
    }
}
