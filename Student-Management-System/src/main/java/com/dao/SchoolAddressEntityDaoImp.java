package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.SchoolAddressEntity;
import com.entity.StudentAddressEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.SchoolAddressEntityRepository;
import com.repository.StudentAddressEntityRepository;
@Repository
public class SchoolAddressEntityDaoImp implements  SchoolAddressEntityDao{

	@Autowired
	SchoolAddressEntityRepository schoolAddressEnityRepository;
	
	public SchoolAddressEntity createSchoolAddress(SchoolAddressEntity schoolAddressEntity) {

		return schoolAddressEnityRepository.saveAndFlush(schoolAddressEntity);
	}

	@Transactional
	public SchoolAddressEntity updateSchoolAddress(SchoolAddressEntity schoolAddressEntity) {
		SchoolAddressEntity entity = schoolAddressEnityRepository.findById(schoolAddressEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("SchoolAddress Entity is not Avaiable please checkout..");

		}
		return schoolAddressEnityRepository.saveAndFlush(schoolAddressEntity);
	}

	public SchoolAddressEntity fetchSchoolAddress(long id) {

		return schoolAddressEnityRepository.findById(id).orElse(null);
	}

	@Override
	public SchoolAddressEntity deleteSchoolAddress(long id) {
		SchoolAddressEntity schooladdress = fetchSchoolAddress(id);
		schoolAddressEnityRepository.deleteById(id);
		return schooladdress;
	}

	


}
