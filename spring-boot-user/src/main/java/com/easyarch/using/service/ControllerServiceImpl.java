package com.easyarch.using.service;

import com.easyarch.using.dao.ControllerDao;
import com.easyarch.using.entity.Controllers;
import com.easyarch.using.service.im.IControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerServiceImpl implements IControllerService {
    @Autowired
    private ControllerDao controllerDao;
    @Override
    public Controllers findByController(int cid) {
        return controllerDao.findByController(cid);
    }

    @Override
    public Controllers findByphoneCon(String phone) {
        return controllerDao.findByphoneCon(phone);
    }

    @Override
    public int insertController(Controllers controller) {
        return controllerDao.insertController(controller);
    }
}
