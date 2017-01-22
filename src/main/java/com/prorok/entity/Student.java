package com.prorok.entity;


public class Student {
    private long id;
    private String name;
    private String lastname;
    private String course;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(long id, String name, String lastname, String course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
