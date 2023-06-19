package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import com.dao.StudentEntityDao;
import com.domain.StudentDomain;
import com.entity.StudentEntity;
import com.notfoundexception.StudentNotFoundException;
import com.objectcopier.ObjectCopier;
import com.repository.StudentEntityRepository;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentEntityDao studentEntityDao;
	
	
	@Transactional
	public StudentDomain createStudent(StudentDomain studentDomain) {

		return toDomain(studentEntityDao.createStudent(toEntity(studentDomain)));
	}

	@Transactional
	public StudentDomain updateStudent(StudentDomain studentDomain) {

		return toDomain(studentEntityDao.updateStudent(toEntity(studentDomain)));
	}

	public StudentDomain fetchStudent(long id) {

		return toDomain(studentEntityDao.fetchStudent(id));
	}

	@Transactional
	public Boolean deleteStudent(long id) {

		return studentEntityDao.deleteStudent(id);
	}

	// creating toDomain method

	private StudentDomain toDomain(StudentEntity studentEntity) {
		StudentDomain domain = null;
		if (studentEntity != null) {
			domain = new com.domain.StudentDomain();
			ObjectCopier.copyObject(studentEntity, domain);
		}
		return domain;
	}

	// creating toEntity method
	private StudentEntity toEntity(StudentDomain studentDomain) {
		StudentEntity entity = null;
		if (studentDomain != null) {
			entity = new com.entity.StudentEntity();
			ObjectCopier.copyObject(studentDomain, entity);
		}

		return entity;
	}

	@Override
	public List<StudentDomain> fetchStudentDetails(Integer offset, Integer limit, String Sortby) {
		Page<com.entity.StudentEntity> page = studentEntityDao.fetchStudentDetails(--offset, limit, Sortby);
		List<StudentDomain> list = new ArrayList<>();
		page.forEach(studentDetails -> {
			StudentDomain domain = toDomain(studentDetails);
			domain.setTotalRecords(page.getTotalElements());
			list.add(domain);
		});
		return list;
	}

	/*@Override
	public boolean deleteStudentD(long id) {
		
		return studentEntityDao.deleteStudent(id);
	}

	*/
		
	
}
