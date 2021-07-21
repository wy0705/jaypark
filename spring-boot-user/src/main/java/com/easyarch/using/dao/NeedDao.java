package com.easyarch.using.dao;

import com.easyarch.using.entity.Need;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NeedDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Need findByNeed(int needid){
        String sql="select needid,agemax,gender,drivingyear,vehicle from need where needid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{needid},
                new BeanPropertyRowMapper<>(Need.class));
    }

    public int insertNeed(Need need){
        String sql="insert into need (needid,agemax,gender,drivingyear,vehicle) value (?,?,?,?,?)";
        return jdbcTemplate.update(sql,need.getNeedid(),need.getAgemax(),need.getGender(),need.getDrivingyear(),need.getVehicle());
    }
}
