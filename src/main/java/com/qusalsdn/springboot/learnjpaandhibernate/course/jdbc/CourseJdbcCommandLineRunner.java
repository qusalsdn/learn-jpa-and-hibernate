package com.qusalsdn.springboot.learnjpaandhibernate.course.jdbc;

import com.qusalsdn.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner { // implements CommandLineRunner로 인해 애플리케이션이 시작될 때 실행되게 된다.
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", "qusalsdn"));
        repository.insert(new Course(2, "Learn Azure Now!", "qusalsdn"));
        repository.insert(new Course(3, "Learn DevOps Now!", "qusalsdn"));
        repository.deleteById(1);
    }
}
