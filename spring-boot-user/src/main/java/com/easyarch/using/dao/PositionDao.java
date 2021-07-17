package com.easyarch.using.dao;

import com.easyarch.using.entity.College;
import com.easyarch.using.entity.Position;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PositionDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Position findByPosition(int pid){
        String sql="select pid,num,salary,name,needid from position where pid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{pid},
                new BeanPropertyRowMapper<>(Position.class));
    }

    public Position findByPosition(String name){
        String sql="select pid,num,salary,name,needid from position where name=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{name},
                new BeanPropertyRowMapper<>(Position.class));
    }

    public int insertPosition(Position position){
        String sql="insert into position (num,salary,name,needid) values(?,?,?,?)";
        return jdbcTemplate.update(sql,position.getNum(),position.getSalary(),position.getName(),position.getNeedid());
    }
}
