package com.easyarch.using.service.im;

import com.easyarch.using.entity.Controllers;

public interface IControllerService {
    public Controllers findByController(int cid);
    public Controllers findByphoneCon(String phone);
    public int insertController(Controllers controller);
}
