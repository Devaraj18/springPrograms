package com.student;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.domain.SchoolDomain;
import com.service.SchoolServiceImp;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)

class SchoolServiceTest {
	
	@Autowired
	SchoolServiceImp schoolServiceImp;
	
	long id =7;
	
	@Test
	public void createSchool() throws Exception{
	SchoolDomain schoolDomain= new SchoolDomain();
		schoolDomain.setId(7);
		schoolDomain.setSchoolName("SSV");
		schoolDomain.setNumberOfSundent(30);
		
		schoolDomain = schoolServiceImp.createSchool(schoolDomain);
	
	}
	@Test
	public void updateSchool() {

		SchoolDomain schoolDomain = new SchoolDomain();

		schoolDomain.setId(3001);

		schoolDomain.setSchoolName("eee");

		schoolDomain = schoolServiceImp.updateSchool(schoolDomain);

		Assert.notNull(schoolDomain);
	}

	@Test
	public void fetchSchool() {
		SchoolDomain schoolDomain = new SchoolDomain();
				schoolDomain = schoolServiceImp.fetchSchool(id);

	}

	@Test
	public void deleteSchool() {
		System.out.print(false);
		boolean b = schoolServiceImp.deleteSchool((long) 7);
		assertTrue(b);

	}

	@Test
   public void fetchSchoolDetails() {
		
     SchoolDomain schoolDomain=new SchoolDomain();
    List<SchoolDomain> list = schoolServiceImp.fetchSchoolDetails(1, 3, "ascending");
     assertThat(list).size().isGreaterThan(0);



	
	}
}
