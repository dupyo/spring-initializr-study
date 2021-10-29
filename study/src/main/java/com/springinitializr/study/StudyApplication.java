package com.springinitializr.study;

import com.springinitializr.study.domain.Course;
import com.springinitializr.study.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
    // JPA test
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {
            Course course1 = new Course("스프링", "홍두표");
            repository.save(course1); // 테이블 생성하면서 데이터 저장.

            List<Course> list = repository.findAll(); // 테이블에 존재하는 모든 데이터 불러오기
            for(Course course : list) {
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }
        };
    }

}
