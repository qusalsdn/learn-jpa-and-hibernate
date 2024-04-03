package com.qusalsdn.springboot.learnjpaandhibernate.course.springDataJpa;

import com.qusalsdn.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Spring Data JPA는 아래와 같이 SpringDataJpaRepository를 생성하고 JpaRepository를 상속받으면서 엔터티와 ID를 지정한 인터페이스를 생성하면 간단하게 사용할 수 있다.
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author); // where문 같이 사용할 수 있는데 findBy<컬럼이름> 형식으로 커스텀 메소드를 만들 수 있다.

    List<Course> findByName(String name);
}
