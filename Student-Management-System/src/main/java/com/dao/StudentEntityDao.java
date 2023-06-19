package com.dao;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.entity.StudentEntity;

@Repository
public interface StudentEntityDao {

	StudentEntity createStudent(StudentEntity studentEntity);

	StudentEntity updateStudent(StudentEntity studentEntity);

	StudentEntity fetchStudent(long id);

	Boolean deleteStudent(long id);

	Page<StudentEntity> fetchStudentDetails(Integer offset, Integer limit, String Sortby);

}
