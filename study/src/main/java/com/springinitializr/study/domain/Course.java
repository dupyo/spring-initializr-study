package com.springinitializr.study.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 대신 생성한다.
@Entity // 테이블임을 나타낸다.
public class Course {

    @Id // ID 값, Primary Key로 사용한다는 뜻을 의미함.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령임. = auto_increment
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함. = not null
    private String title;

    @Column(nullable = false)
    private String tutor;

    public String getTitle() {
        return this.title;
    }

    public String getTutor() {
        return this.tutor;
    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}
