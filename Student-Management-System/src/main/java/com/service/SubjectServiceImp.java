package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentAddressEntityDao;
import com.dao.SubjectEntityDao;
import com.domain.StudentAddressDomain;
import com.domain.SubjectDomain;
import com.entity.StudentAddressEntity;
import com.entity.SubjectEntity;
import com.objectcopier.ObjectCopier;

@Service
public class SubjectServiceImp implements SubjectService{
	
	@Autowired
	SubjectEntityDao subjectEntityDao;

	@Transactional
	public SubjectDomain createSubject(SubjectDomain subjectDomain) {
		return toDomain(subjectEntityDao.createSubject(toEntity(subjectDomain)));
	}

	@Transactional
	public SubjectDomain updateSubject(SubjectDomain subjectDomain) {
		return toDomain(subjectEntityDao.updateSubject(toEntity(subjectDomain)));
	}

	public SubjectDomain fetchSubject(long id) {
		return toDomain(subjectEntityDao.fetchSubject(id));
	}

	@Transactional
	public Boolean deleteSubject(long id) {
		return subjectEntityDao.deleteSubject(id);
	}

	// creating to entity method.
	private SubjectEntity toEntity(SubjectDomain subjectDomain) {
		SubjectEntity entity = null;
		if (subjectDomain != null) {
			entity = new com.entity.SubjectEntity();
			ObjectCopier.copyObject(subjectDomain, entity);
		}
		return entity;
	}

	// creating to Domain method;
	private SubjectDomain toDomain(SubjectEntity subjectEntity) {
		SubjectDomain domain = null;
		if (subjectEntity != null) {
			domain = new com.domain.SubjectDomain();
			ObjectCopier.copyObject(subjectEntity, domain);
		}
		return domain;
	}

	
}


