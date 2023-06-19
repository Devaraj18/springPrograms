package com.service;

import org.springframework.stereotype.Service;

import com.domain.StudentAddressDomain;

@Service
public interface StudentAddressService {

	StudentAddressDomain createStudentAddress(StudentAddressDomain studentAddressDomain);

	StudentAddressDomain updateStudentAddress(StudentAddressDomain studentAddressDomain);

	StudentAddressDomain fetchStudentAddress(long id);

	Boolean deleteStudentAddress(long id);

}
