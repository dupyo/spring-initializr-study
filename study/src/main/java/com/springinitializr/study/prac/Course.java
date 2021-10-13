package com.springinitializr.study.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러남.
    private String title;    // this.title
    private String tutor;    // this.tutor
    private int days;    // this.days

    // 아무런 파라미터가 없는 생성자를 기본생성자 라고 부른다.
    // 어떤 생성자도 생성되지 않았다면 자바에서 기본적으로 기본생성자를 생성함.
    // 기본생성자
    public Course() {

    }

    // 생성자
    public Course(String title, String tutor, int days) {
        // this 는 클래스 변수를 가리킨다.
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    public void setDays(int days) {
        this.days = days;
    }

    // Getter
    public String getTitle() {
        return this.title;
    }
    public String getTutor() {
        return this.tutor;
    }
    public int getDays() {
        return this.days;
    }


}