package com.easyarch.using.dao;

import com.easyarch.using.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Message findByMessage(int mid){
        String sql="select mid,name,email,birthday,gender,salary,permanentAddress from message where mid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{mid},
                new BeanPropertyRowMapper<>(Message.class));
    }

    public Message findByNameMes(String name){
        String sql="select mid,name,email,birthday,gender,salary,permanentAddress from message where name=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{name},
                new BeanPropertyRowMapper<>(Message.class));
    }

    public int insertMessage(Message message){
        String sql="insert into message (name,email,birthday,gender,salary,permanentAddress) value (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,message.getName(),message.getEmail(),message.getBirthday(),message.getGender(),message.getSalary(),message.getPermanentAddress());
    }
}
