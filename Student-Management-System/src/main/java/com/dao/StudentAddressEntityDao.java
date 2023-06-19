package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.StudentAddressEntity;

@Repository
public interface StudentAddressEntityDao {

	StudentAddressEntity createStudentAddress(StudentAddressEntity studentAddressEntity);

	StudentAddressEntity updateStudentAddress(StudentAddressEntity studentAddressEntity);

	StudentAddressEntity fetchStudentAddress(long id);

	Boolean deleteStudentAddress(long id);

}
