package com.easyarch.using.service.im;

import com.easyarch.using.entity.Need;

public interface INeedService {
    public Need findByNeed(int needid);
    public int insertNeed(Need need);

}
