package com.dao;

import com.entity.SubjectEntity;

public interface SubjectEntityDao {
	
	SubjectEntity createSubject(SubjectEntity subjectEntity);
	
	SubjectEntity updateSubject(SubjectEntity subjectEntity);
	
	SubjectEntity fetchSubject(long id);
	
	Boolean deleteSubject(long id);

}
