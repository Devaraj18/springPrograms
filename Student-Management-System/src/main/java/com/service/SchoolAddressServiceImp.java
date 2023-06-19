package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SchoolAddressEntityDao;
import com.domain.SchoolAddressDomain;
import com.entity.SchoolAddressEntity;
import com.objectcopier.ObjectCopier;

@Service
public class SchoolAddressServiceImp implements SchoolAddressService{
	
	@Autowired
	SchoolAddressEntityDao schoolAddressEntityDao;

	@Transactional
	public SchoolAddressDomain createSchoolAddress(SchoolAddressDomain schoolAddressDomain) {
		return toDomain(schoolAddressEntityDao.createSchoolAddress(toEntity(schoolAddressDomain)));
	}

	@Transactional
	public SchoolAddressDomain updateSchoolAddress(SchoolAddressDomain schoolAddressDomain) {
		return toDomain(schoolAddressEntityDao.updateSchoolAddress(toEntity(schoolAddressDomain)));
	}

	public SchoolAddressDomain fetchSchoolAddress(long id) {
		return toDomain(schoolAddressEntityDao.fetchSchoolAddress(id));
	}

	@Transactional
	public SchoolAddressDomain deleteSchoolAddress(long id) {
		return toDomain(schoolAddressEntityDao.deleteSchoolAddress(id));
	}

	// creating to entity method.
	private SchoolAddressEntity toEntity(SchoolAddressDomain schoolAddressDomain) {
		SchoolAddressEntity entity = null;
		if (schoolAddressDomain != null) {
			entity = new com.entity.SchoolAddressEntity();
			ObjectCopier.copyObject(schoolAddressEntityDao, entity);
		}
		return entity;
	}

	// creating to Domain method;
	private SchoolAddressDomain toDomain(SchoolAddressEntity schoolAddressEntity) {
		SchoolAddressDomain domain = null;
		if (schoolAddressEntity != null) {
			domain = new com.domain.SchoolAddressDomain();
			ObjectCopier.copyObject(schoolAddressEntity, domain);
		}
		return domain;
	}
}

