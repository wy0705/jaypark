package com.easyarch.using.dao;

import com.easyarch.using.entity.College;
import com.easyarch.using.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Company findByCompany(int eid){
        String sql="select eid,name from company where eid=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{eid},
                new BeanPropertyRowMapper<>(Company.class));
    }

    public int insertCompany(Company company) {
        String sql = "insert into company (name) value(?)";
        return jdbcTemplate.update(sql,company.getName());
    }
}
