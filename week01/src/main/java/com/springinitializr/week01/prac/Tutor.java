package com.springinitializr.week01.prac;

public class Tutor {
    // 멤버변수 선언
    private String name;
    private String bio;

    // 기본생성자
    public Tutor() {

    }

    // 생성자
    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    // Getter
    public String getName() {
        return this.name;
    }
    public String getBio() {
        return this.bio;
    }
    // toString() 오버라이딩
    @Override
    public String toString() {
        return "Tutor { name: " + getName() + ", bio: " + getBio() + " }";
    }
}
