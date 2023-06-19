package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import com.entity.StudentEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.StudentEntityRepository;

@Repository
public class StudentEntityDaoImp implements StudentEntityDao {

	@Autowired
	StudentEntityRepository studentEntityRepository;

	@Transactional
	public StudentEntity createStudent(StudentEntity studentEntity) {

		return studentEntityRepository.saveAndFlush(studentEntity);
	}

	@Transactional
	public StudentEntity updateStudent(StudentEntity studentEntity) {
		StudentEntity entity = studentEntityRepository.findById(studentEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("Student Entity is not Available please checkout..");
		}
		return studentEntityRepository.saveAndFlush(studentEntity);
	}

	public StudentEntity fetchStudent(long id) {

		return studentEntityRepository.findById(id).orElse(null);
	}

	@Transactional
	public Boolean deleteStudent(long id) {
		Boolean b= false;
		StudentEntity student = fetchStudent(id);
		if(student==null) {
		throw new StudentNotFoundException("Student is null ..");
		}
		else {
			studentEntityRepository.deleteById(id);
		b = true;
		}
	
		return b;
	}

	@Override
	public Page<StudentEntity> fetchStudentDetails(Integer offset, Integer limit, String Sortby) {
		Pageable pageable = PageRequest.of(offset, limit, Sort.by("id").descending());
		return studentEntityRepository.findAll(pageable);
	}


	
	
}
