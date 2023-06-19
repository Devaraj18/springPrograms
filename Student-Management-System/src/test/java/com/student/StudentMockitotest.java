package com.student;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.StudentEntityDao;
import com.domain.StudentDomain;
import com.entity.StudentEntity;
import com.repository.StudentEntityRepository;
import com.service.StudentServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class StudentMockitotest {
	
	@Autowired
	StudentServiceImp studentServiceImp;
	
	@Autowired
	StudentDomain studentDomain;
	
	@MockBean
	StudentEntityRepository studentEntityDao;
	/*
	@Test
	public void fetchStudent() {
		
		//StudentDomain studentDomain = new StudentDomain();
		when(studentEntityDao.createStudent(studentEntityDao)thenRuturn(Stream.of(new StudentEntity(34,"ram","ind","ThirdClass",9009005238,9)collect(Collectors.toList())));
        assertEquals(1, studentServiceImp.createStudent().size());
	}
	*/
  long id = 1;
  @Test
	public void createStudent() throws Exception{
	StudentEntity studentEntity = new StudentEntity();

	//studentEntity.setId(id);
	studentEntity.setFirstName("R");
	studentEntity.setLastName("Indluru");
	studentEntity.setStudentClass("Third");
	studentEntity.setStudentPhone(12345678);
	studentEntity.setStudnetAge(12);
	
	when(studentEntityDao.saveAndFlush(studentEntity).thenReturn(studentEntity));
	assertEquals(studentEntity,studentServiceImp.createStudent(studentDomain));
	
}
  
  @Test
	public void deleteStudent() {
		
		//StudentEntity studentEntity = new StudentEntity(1,"Dell",5,35.56);
		boolean b = studentServiceImp.deleteStudent((long) 1006);

		studentServiceImp.deleteStudent(1);
      verify(studentEntityDao,times(1)).delete(null);;
	}
}
