package com.easyarch.using.service;

import com.easyarch.using.entity.UserAndC;

import java.util.List;

public interface IUserAndCService {
    List<Integer> findCollegeByuid(int uid);

    int insertUandC(UserAndC userAndC);
}
