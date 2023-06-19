package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import com.entity.StudentAddressEntity;
import com.entity.StudentEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.StudentAddressEntityRepository;

@Repository
public class StudentAddressEntityDaoImp implements StudentAddressEntityDao {

	@Autowired
	StudentAddressEntityRepository studentAddressEnityRepository;

	@Transactional
	public StudentAddressEntity createStudentAddress(StudentAddressEntity studentAddressEntity) {

		return studentAddressEnityRepository.saveAndFlush(studentAddressEntity);
	}

	@Transactional
	public StudentAddressEntity updateStudentAddress(StudentAddressEntity studentAddressEntity) {
		StudentAddressEntity entity = studentAddressEnityRepository.findById(studentAddressEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("StudentAddress Entity is not Avaiable please checkout..");

		}
		return studentAddressEnityRepository.saveAndFlush(studentAddressEntity);
	}

	public StudentAddressEntity fetchStudentAddress(long id) {

		return studentAddressEnityRepository.findById(id).orElse(null);
	}

	@Override
	public Boolean deleteStudentAddress(long id) {
		Boolean b= false;
		StudentAddressEntity student = fetchStudentAddress(id);
		if(student==null) {
		throw new StudentNotFoundException("Student is null ..");
		}
		else {
			studentAddressEnityRepository.deleteById(id);
		b = true;
		}
	
		return b;
	}

}