package com.easyarch.using.service;

import com.easyarch.using.dao.User_posDao;
import com.easyarch.using.entity.User_pos;
import com.easyarch.using.service.im.IUser_posService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class User_posServiceImpl implements IUser_posService {
    @Autowired
    private User_posDao user_posDao;
    @Override
    public List<Integer> findByUserpos(int uid) {
        return user_posDao.findByUserpos(uid);
    }

    @Override
    public int insertuser_pos(User_pos user_pos) {
        return user_posDao.insertuser_pos(user_pos);
    }
}
