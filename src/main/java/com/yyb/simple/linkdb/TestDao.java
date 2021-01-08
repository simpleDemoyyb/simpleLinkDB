package com.yyb.simple.linkdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String test() {
        String sql = "select 1";
        final List<String> list = new ArrayList();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                list.add(resultSet.getString("1"));
            }
        });
        return list.get(0);
    }
}
