package com.easyarch.using.dao;

import com.easyarch.using.entity.College;
import com.easyarch.using.entity.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ResumeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Integer> findByResume(int pid){
        String sql="select pid,uid from resume where pid=?";
        return jdbcTemplate.query(sql, new Object[]{pid}, new RowMapper<Integer>() {

            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt(1);
            }
        });
    }

    public int insertResume(Resume resume){
        String sql="insert into resume (pid,uid) values (?,?)";
        return jdbcTemplate.update(sql,resume.getPid(),resume.getUid());
    }
}
