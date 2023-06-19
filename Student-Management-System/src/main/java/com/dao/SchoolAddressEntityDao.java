package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.SchoolAddressEntity;
@Repository
public interface SchoolAddressEntityDao {
	
	SchoolAddressEntity createSchoolAddress(SchoolAddressEntity schoolAddressEntity);

	SchoolAddressEntity updateSchoolAddress(SchoolAddressEntity schoolAddressEntity);

	SchoolAddressEntity fetchSchoolAddress(long id);

	SchoolAddressEntity deleteSchoolAddress(long id);

}
