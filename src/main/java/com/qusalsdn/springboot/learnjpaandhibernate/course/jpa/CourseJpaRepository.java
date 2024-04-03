package com.qusalsdn.springboot.learnjpaandhibernate.course.jpa;

import com.qusalsdn.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // JPA로 쿼리를 실행하려고 할 때마다 트랜잭션을 허용해야 하는데 이 때 해당 어노테이션이 필요하다.
public class CourseJpaRepository {
    @PersistenceContext // 컨테이너 관리형 EntityManager 및 그에 연결된 영속성 컨텍스트와의 종속성을 나타낸다.
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
