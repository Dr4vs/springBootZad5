package com.prorok.dao;

import com.prorok.entity.Student;

import java.util.Collection;

public interface StudentDAO {
     Collection<Student> getAllStudents();
     Student getStudentsById(Long id);
     void deleteStudentById(Long id);
     void addStudent(Student student);
     void updateStudent(Student student);
}
