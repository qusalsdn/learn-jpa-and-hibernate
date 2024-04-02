package com.qusalsdn.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            insert into course (name, author) values ('Learn AWS', 'qusalsdn')
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
