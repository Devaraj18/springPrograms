package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.SubjectEntity;
import com.entity.TeacherEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.SubjectEntityRepository;

@Repository
public class SubjectEntityDaoImp implements SubjectEntityDao{

	@Autowired
	SubjectEntityRepository subjectEntityRepository;
	
	@Override
	public SubjectEntity createSubject(SubjectEntity subjectEntity) {
		return subjectEntityRepository.saveAndFlush(subjectEntity);
	}

	@Override
	public SubjectEntity updateSubject(SubjectEntity subjectEntity) {
		SubjectEntity entity = subjectEntityRepository.findById(subjectEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("Teacher Entity is not Available please checkout..");
		}
		return subjectEntityRepository.saveAndFlush(subjectEntity);
	}

	@Override
	public SubjectEntity fetchSubject(long id) {
		return subjectEntityRepository.findById(id).orElse(null);
	}

	@Override
	public Boolean deleteSubject(long id) {
		Boolean b= false;
		SubjectEntity subject = fetchSubject(id);
		if(subject==null) {
		throw new StudentNotFoundException("Subjrct is null ..");
		}
		else {
			subjectEntityRepository.deleteById(id);
		b = true;
		}
	
		return b;
	}

}
