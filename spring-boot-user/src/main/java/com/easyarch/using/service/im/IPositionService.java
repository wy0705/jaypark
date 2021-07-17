package com.easyarch.using.service.im;

import com.easyarch.using.entity.Position;

public interface IPositionService {
    public Position findByPosition(int pid);
    public Position findByPosition(String name);
    public int insertPosition(Position position);
}
