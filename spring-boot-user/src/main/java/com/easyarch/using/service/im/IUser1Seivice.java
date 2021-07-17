package com.easyarch.using.service.im;

import com.easyarch.using.entity.User1;

public interface IUser1Seivice {
    public User1 findByuser(int uid);
    public User1 findByname(String name);
    public int insertUser1(User1 user1);
}
