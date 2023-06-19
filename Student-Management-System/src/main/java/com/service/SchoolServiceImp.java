package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.dao.SchoolEntityDao;
import com.domain.SchoolDomain;
import com.entity.SchoolEntity;
import com.objectcopier.ObjectCopier;

@Service
public class SchoolServiceImp implements SchoolService
{
	@Autowired
	SchoolEntityDao schoolEntityDao;

	@Transactional
	public SchoolDomain createSchool(SchoolDomain schoolDomain) {

		return toDomain(schoolEntityDao.createSchool(toEntity(schoolDomain)));
	}

	@Transactional
	public SchoolDomain updateSchool(SchoolDomain schoolDomain) {

		return toDomain(schoolEntityDao.updateSchool(toEntity(schoolDomain)));
	}

	public SchoolDomain fetchSchool(long id) {

		return toDomain(schoolEntityDao.fetchSchool(id));
	}

	@Transactional
	public Boolean deleteSchool(long id) {

		return schoolEntityDao.deleteSchool(id);
	}

	// making To Domain method

	private SchoolDomain toDomain(SchoolEntity schoolDetails) {
		SchoolDomain domain = null;
		if (schoolDetails != null) {
			domain = new com.domain.SchoolDomain();
			ObjectCopier.copyObject(schoolDetails, domain);
		}
		return domain;
	}

	// making to Entity method
	private SchoolEntity toEntity(SchoolDomain schoolDomain) {
		SchoolEntity entity = null;
		if (schoolDomain != null) {
			entity = new com.entity.SchoolEntity();
			ObjectCopier.copyObject(schoolDomain, entity);
		}

		return entity;
	}

	@Override
	public List<SchoolDomain> fetchSchoolDetails(Integer offset, Integer limit, String Sortby) {
		Page<com.entity.SchoolEntity> page = schoolEntityDao.fetchSchoolDetails(--offset, limit, Sortby);
		List<SchoolDomain> list = new ArrayList<>();
		page.forEach(schoolDetails -> {
			SchoolDomain domain = toDomain(schoolDetails);
			domain.setTotalRecords(page.getTotalElements());
			list.add(domain);
		});
		return list;
	}

}

