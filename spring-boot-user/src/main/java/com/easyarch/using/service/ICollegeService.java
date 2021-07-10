package com.easyarch.using.service;

import com.easyarch.using.entity.College;

import java.util.List;

public interface ICollegeService {
    College findByCollege(int cid);

    List<Integer> findByAddress(String address);

    List<Integer> findByType(String type);

    List<Integer> findByFeature(String feature);

    College findByName(String name);

    int insertCollege(College college);

    int updateCollege(College college);
}
