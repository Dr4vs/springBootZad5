package com.prorok.dao;

import com.prorok.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAOImp implements StudentDAO{

    Map<Long,Student> studentMap ;

    public StudentDAOImp() {
        studentMap = new HashMap<>();
        Student s1 = new Student(1,"Darek","Romek","BootCamp");
        Student s2 = new Student(2,"Rafal","Domagala","BootCamp");
        Student s3 = new Student(3,"Patryk","Kaczmarek","Frontend");
        Student s4 = new Student(4,"Monika","Duda","Frontend");
        Student s5 = new Student(5,"Robert","Zawila","Frontend");
        Student s6 = new Student(6,"Karol","Poziomka","HTML");

       studentMap.put(s1.getId(),s1);
       studentMap.put(s2.getId(),s2);
       studentMap.put(s3.getId(),s3);
       studentMap.put(s4.getId(),s4);
       studentMap.put(s5.getId(),s5);
       studentMap.put(s6.getId(),s6);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentMap.values();
    }

    @Override
    public Student getStudentsById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentMap.remove(id);
    }

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void updateStudent(Student student) {
        studentMap.replace(student.getId(),student);
    }
}
