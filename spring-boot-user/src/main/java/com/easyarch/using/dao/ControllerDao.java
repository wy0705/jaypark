package com.easyarch.using.dao;

import com.easyarch.using.entity.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ControllerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Controllers findByController(int cid){
        String sql="select cid,phone,password from controller where cid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{cid},
                new BeanPropertyRowMapper<>(Controllers.class));
    }

    public Controllers findByphoneCon(String phone){
        String sql="select cid,phone,password from controller where phone=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{phone},
                new BeanPropertyRowMapper<>(Controllers.class));
    }

    public int insertController(Controllers controller) {
        String sql="insert into controller (phone,password) value (?,?)";
        return jdbcTemplate.update(sql,controller.getPhone(),controller.getPassword());
    }
}
