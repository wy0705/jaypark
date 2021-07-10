package com.easyarch.using.service;

import com.easyarch.using.entity.User;

public interface IUserService {

    User findUserByName(String username);

    User findUserByNameAndPassword(String username,String password);

    boolean register(User user);

    User findById(int id);

    int updateUserName(User user);

    int insertUser(User user);

    int updateUser(User user);
}
