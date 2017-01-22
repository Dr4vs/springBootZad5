package com.prorok.service;

import com.prorok.dao.StudentDAO;
import com.prorok.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService{


    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Collection<Student> getAllStudents() {
       return studentDAO.getAllStudents();
    }

    @Override
    public Student getStudentsById(Long id) {
       return studentDAO.getStudentsById(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentDAO.deleteStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.addStudent(student);
    }
}
