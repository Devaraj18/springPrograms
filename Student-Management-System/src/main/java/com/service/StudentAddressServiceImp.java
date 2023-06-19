package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.dao.StudentAddressEntityDao;
import com.domain.StudentAddressDomain;
import com.entity.StudentAddressEntity;
import com.objectcopier.ObjectCopier;

@Service
public class StudentAddressServiceImp implements StudentAddressService {

	@Autowired
	StudentAddressEntityDao studentAddressEntityDao;

	@Transactional
	public StudentAddressDomain createStudentAddress(StudentAddressDomain studentAddressDomain) {
		return toDomain(studentAddressEntityDao.createStudentAddress(toEntity(studentAddressDomain)));
	}

	@Transactional
	public StudentAddressDomain updateStudentAddress(StudentAddressDomain studentAddressDomain) {
		return toDomain(studentAddressEntityDao.updateStudentAddress(toEntity(studentAddressDomain)));
	}

	public StudentAddressDomain fetchStudentAddress(long id) {
		return toDomain(studentAddressEntityDao.fetchStudentAddress(id));
	}

	@Transactional
	public Boolean deleteStudentAddress(long id) {
		return studentAddressEntityDao.deleteStudentAddress(id);
	}

	// creating to entity method.
	private StudentAddressEntity toEntity(StudentAddressDomain studentAddressDomain) {
		StudentAddressEntity entity = null;
		if (studentAddressDomain != null) {
			entity = new com.entity.StudentAddressEntity();
			ObjectCopier.copyObject(studentAddressDomain, entity);
		}
		return entity;
	}

	// creating to Domain method;
	private StudentAddressDomain toDomain(StudentAddressEntity studentAddressEntity) {
		StudentAddressDomain domain = null;
		if (studentAddressEntity != null) {
			domain = new com.domain.StudentAddressDomain();
			ObjectCopier.copyObject(studentAddressEntity, domain);
		}
		return domain;
	}
}
