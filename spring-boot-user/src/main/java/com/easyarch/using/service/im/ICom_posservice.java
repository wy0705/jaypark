package com.easyarch.using.service.im;

import com.easyarch.using.entity.Com_pos;

import java.util.List;

public interface ICom_posservice {
    public List<Integer> findUser_pos(int eid);
    public int insertCom_pos(Com_pos com_pos);

}
