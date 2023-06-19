package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.domain.StudentDomain;

@Service
public interface StudentService {

	StudentDomain createStudent(StudentDomain studentDomain);

	StudentDomain updateStudent(StudentDomain studentDomain);

	StudentDomain fetchStudent(long id);

	Boolean deleteStudent(long id);

	List<StudentDomain> fetchStudentDetails(Integer offset, Integer limit, String Sortby);
	
	//StudentDomain deleteStudentD(long id);

}
