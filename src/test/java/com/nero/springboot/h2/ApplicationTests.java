package com.nero.springboot.h2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testCase1() throws ClassNotFoundException, SQLException {
        List<Map<String,Object>> list = jdbcTemplate.queryForList("Select * from user ");
        System.out.println(list);
    }

}
