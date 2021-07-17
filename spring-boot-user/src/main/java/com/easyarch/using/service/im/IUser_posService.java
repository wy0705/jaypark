package com.easyarch.using.service.im;

import com.easyarch.using.entity.User_pos;

import java.util.List;

public interface IUser_posService {
    public List<Integer> findByUserpos(int uid);
    public int insertuser_pos(User_pos user_pos);
}
