package com.springinitializr.study.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // JPA는 Repository를 통해서만 사용 가능.
    // 인터페이스는 클래스에서 멤버변수가 없는 메소드 집합.
}
