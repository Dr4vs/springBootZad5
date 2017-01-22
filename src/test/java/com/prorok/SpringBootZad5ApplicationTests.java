package com.prorok;

import com.prorok.dao.StudentDAO;

import com.prorok.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootZad5ApplicationTests {

	@Autowired
	private StudentDAO studentDAO;

	@Test
	public void getAllStudents() {
		long count = studentDAO.getAllStudents().stream().count();
		assertEquals(count,6);
	}
	@Test
	public void showAllStudents() {
		studentDAO.getAllStudents().forEach(student -> student.toString());

	}
	@Test
	public void addStudent(){
		Student newStudent = new Student(7,"Marcin","Kapsuta","PHP");
		studentDAO.addStudent(newStudent);
	}
	@Test
	public void deleteStudents(){
		studentDAO.deleteStudentById(3L);
	}
	@Test
	public void updateStudent() {
		Student updateStudent = new Student(7,"Marcin","Kapsuta","MySQL");
		studentDAO.addStudent(updateStudent);
	}
}
