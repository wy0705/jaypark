package com.easyarch.using.dao;

import com.easyarch.using.entity.Com_pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Com_posDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Integer> findUser_pos(int eid){
        String sql="select eid,pid from com_pos where eid=?";
        return jdbcTemplate.query(sql, new Object[]{eid}, new RowMapper<Integer>() {

            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt(1);
            }
        });
    }

    public int insertCom_pos(Com_pos com_pos){
        String sql="insert into com_pos(eid,cid) values (?,?)";
        return jdbcTemplate.update(sql,com_pos.getEid(),com_pos.getPid());
    }
}
