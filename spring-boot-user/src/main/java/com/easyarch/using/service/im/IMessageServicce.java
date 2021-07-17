package com.easyarch.using.service.im;

import com.easyarch.using.entity.Message;

public interface IMessageServicce {
    public Message findByMessage(int mid);
    public Message findByNameMes(String name);
    public int insertMessage(Message message);
}
