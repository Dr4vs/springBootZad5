package com.prorok.service;

import com.prorok.dao.StudentDAOImp;
import com.prorok.entity.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> getAllStudents();
    Student getStudentsById(Long id);
    void deleteStudentById(Long id);
    void addStudent(Student student);
    void updateStudent(Student student);
}
