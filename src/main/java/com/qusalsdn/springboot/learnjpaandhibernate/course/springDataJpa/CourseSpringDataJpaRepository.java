package com.qusalsdn.springboot.learnjpaandhibernate.course.springDataJpa;

import com.qusalsdn.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

//Spring Data JPA는 아래와 같이 SpringDataJpaRepository를 생성하고 JpaRepository를 상속받으면서 엔터티와 ID를 지정한 인터페이스를 생성하면 간단하게 사용할 수 있다.
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
