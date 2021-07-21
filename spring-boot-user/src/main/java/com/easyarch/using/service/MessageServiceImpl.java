package com.easyarch.using.service;

import com.easyarch.using.dao.MessageDao;
import com.easyarch.using.entity.Message;
import com.easyarch.using.service.im.IMessageServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements IMessageServicce {
    @Autowired
    private MessageDao messageDao;
    @Override
    public Message findByMessage(int mid) {
        return messageDao.findByMessage(mid);
    }

    @Override
    public Message findByNameMes(String name) {
        return messageDao.findByNameMes(name);
    }

    @Override
    public int insertMessage(Message message) {
        return messageDao.insertMessage(message);
    }
}
