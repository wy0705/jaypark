package com.easyarch.using.service;

import com.easyarch.using.dao.PositionDao;
import com.easyarch.using.entity.Position;
import com.easyarch.using.service.im.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private PositionDao positionDao;
    @Override
    public Position findByPosition(int pid) {
        return positionDao.findByPosition(pid);
    }

    @Override
    public Position findByPosition(String name) {
        return positionDao.findByPosition(name);
    }

    @Override
    public int insertPosition(Position position) {
        return positionDao.insertPosition(position);
    }
}
