package com.student;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.StudentDomain;
import com.service.StudentServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceTest {}
/*
	@Autowired
	StudentServiceImp studentService;

	long id = 101;

	@Test
	public void createStudent() throws Exception {
		StudentDomain studentDomain = new StudentDomain();

		studentDomain.setId(id);
		studentDomain.setFirstName("Ranjith");
		studentDomain.setLastName("Indluru");
		studentDomain.setStudentClass("5");
		studentDomain.setStudentPhone(12345678);
		studentDomain.setStudnetAge(12);

		studentDomain = studentService.createStudent(studentDomain);

	}

	@Test
	public void updateStudent() {
		StudentDomain studentDomain = new StudentDomain();
		studentDomain = studentService.createStudent(studentDomain);

		studentDomain = studentService.updateStudent(studentDomain);

	}

	@Test
	public void fetchStudent() {
		StudentDomain studentDomain = new StudentDomain();
		studentDomain = studentService.createStudent(studentDomain);
		
		studentDomain = studentService.fetchStudent(id);

	}


	@Test
	public boolean DeleteStudent() {
	boolean result=false;
	StudentDomain studentDomain=new StudentDomain();
	studentDomain = studentService.fetchStudent(id);
	result = studentService.deleteStudent(id);

	}


	@Test
	public void getStudentList() {
		StudentDomain studentDomain = new StudentDomain();
        studentDomain = studentService.createStudent(studentDomain);
        
		List<StudentDomain> list = studentService.fetchStudentDetails(1, 1, "ascending");

	}

}
*/