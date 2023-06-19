package com.service;

import org.springframework.stereotype.Service;

import com.domain.SchoolAddressDomain;

@Service
public interface SchoolAddressService {
	

	SchoolAddressDomain createSchoolAddress(SchoolAddressDomain schoolAddressDomain);

	SchoolAddressDomain updateSchoolAddress(SchoolAddressDomain schoolAddressDomain);

	SchoolAddressDomain fetchSchoolAddress(long id);

	SchoolAddressDomain deleteSchoolAddress(long id);

}
