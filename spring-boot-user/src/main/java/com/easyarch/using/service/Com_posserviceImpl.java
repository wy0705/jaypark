package com.easyarch.using.service;

import com.easyarch.using.dao.Com_posDao;
import com.easyarch.using.entity.Com_pos;
import com.easyarch.using.service.im.ICom_posservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Com_posserviceImpl implements ICom_posservice {
    @Autowired
    private Com_posDao comPosDao;
    @Override
    public List<Integer> findUser_pos(int eid) {
        return comPosDao.findUser_pos(eid);
    }

    @Override
    public int insertCom_pos(Com_pos com_pos) {
        return comPosDao.insertCom_pos(com_pos);
    }
}
