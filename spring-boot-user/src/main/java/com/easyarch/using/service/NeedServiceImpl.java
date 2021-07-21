package com.easyarch.using.service;

import com.easyarch.using.dao.NeedDao;
import com.easyarch.using.entity.Need;
import com.easyarch.using.service.im.INeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeedServiceImpl implements INeedService {
    @Autowired
    private NeedDao needDao;

    @Override
    public Need findByNeed(int needid) {
        return needDao.findByNeed(needid);
    }

    @Override
    public int insertNeed(Need need) {
        return needDao.insertNeed(need);
    }
}
