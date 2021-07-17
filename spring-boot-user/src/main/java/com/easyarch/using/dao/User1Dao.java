package com.easyarch.using.dao;

import com.easyarch.using.entity.College;
import com.easyarch.using.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class User1Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User1 findByuser(int uid){
        String sql="select uid,phone,password,mid from user where uid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{uid},
                new BeanPropertyRowMapper<>(User1.class));
    }

    public User1 findByname(String name){
        String sql="select uid,phone,password,mid from user where name=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{name},
                new BeanPropertyRowMapper<>(User1.class));
    }

    public int insertUser1(User1 user1){
        String sql="insert into user1 (phone,password,mid) values (?,?,?)";
        return jdbcTemplate.update(sql,user1.getPhone(),user1.getPhone(),user1.getMid());
    }
}
