package com.student;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.domain.StudentDomain;
import com.service.StudentServiceImp;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)

class StudentManagementSystemApplicationTests {

	@Autowired
	StudentServiceImp studentService;

	long id = 2039;

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

		studentDomain.setId((long) 2039);

		studentDomain.setFirstName("Ranjit");

		studentDomain = studentService.updateStudent(studentDomain);

		Assert.notNull(studentDomain);
	}

	@Test
	public void fetchStudent() {
		StudentDomain studentDomain = new StudentDomain();
				studentDomain = studentService.fetchStudent(id);

	}

	@Test
	public void deleteStudent() {
		boolean b = studentService.deleteStudent((long) 1006);
		assertTrue(b);

	}

	@Test
   public void fetchStudentDetails() {
		
     StudentDomain studentDomain=new StudentDomain();
    List<StudentDomain> list = studentService.fetchStudentDetails(1, 3, "ascending");
     assertThat(list).size().isGreaterThan(0);



	
   

}
}
