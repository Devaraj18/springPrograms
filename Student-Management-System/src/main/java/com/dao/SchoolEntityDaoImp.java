package com.dao;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.entity.SchoolEntity;
import com.entity.StudentEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.SchoolEntityRepository;
import com.repository.StudentEntityRepository;

@Repository
public class SchoolEntityDaoImp implements SchoolEntityDao{

	@Autowired
	SchoolEntityRepository schoolEntityRepository;
	
	@Autowired
	StudentEntityRepository studentEntityRepository;

	@Transactional
	public SchoolEntity createSchool(SchoolEntity schoolEntity) {

		return schoolEntityRepository.saveAndFlush(schoolEntity);
	}

	@Transactional
	public SchoolEntity updateSchool(SchoolEntity schoolEntity) {
		SchoolEntity entity = schoolEntityRepository.findById(schoolEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("School Entity is not Available please checkout..");
		}
		return schoolEntityRepository.saveAndFlush(schoolEntity);
	}

	public SchoolEntity fetchSchool(long id) {

		return schoolEntityRepository.findById(id).orElse(null);
	}

	@Transactional
	public Boolean deleteSchool(long id) {
		Boolean b= false;
		SchoolEntity student = fetchSchool(id);
		if(student==null) {
		throw new StudentNotFoundException("School is notFound, please checkout ..");
		}
		else {
			schoolEntityRepository.deleteById(id);
		b = true;
		}
	
		return b;
	}

	@Override
	public Page<SchoolEntity> fetchSchoolDetails(Integer offset, Integer limit, String Sortby) {
		Pageable pageable = PageRequest.of(offset, limit, Sort.by("id").descending());
		return schoolEntityRepository.findAll(pageable);
	}

}
