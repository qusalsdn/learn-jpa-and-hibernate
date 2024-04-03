package com.qusalsdn.springboot.learnjpaandhibernate.course;

import com.qusalsdn.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner { // implements CommandLineRunner로 인해 애플리케이션이 시작될 때 실행되게 된다.
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Now!", "qusalsdn"));
        repository.save(new Course(2, "Learn Azure Now!", "qusalsdn"));
        repository.save(new Course(3, "Learn DevOps Now!", "qusalsdn"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
