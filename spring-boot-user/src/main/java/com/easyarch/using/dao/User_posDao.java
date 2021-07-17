package com.easyarch.using.dao;

import com.easyarch.using.entity.User_pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class User_posDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Integer> findByUserpos(int uid){
        String sql="select uid,pid from user_pos where uid=?";
        return jdbcTemplate.query(sql, new Object[]{uid}, new RowMapper<Integer>() {

            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt(1);
            }
        });
    }

    public int insertuser_pos(User_pos user_pos){
        String sql="insert into user_pos (uid,pid) values(?,?)";
        return jdbcTemplate.update(sql,user_pos.getUid(),user_pos.getPid());
    }
}
